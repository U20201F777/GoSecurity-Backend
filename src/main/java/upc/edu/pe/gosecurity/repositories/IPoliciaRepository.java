package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.Pertenencias;
import upc.edu.pe.gosecurity.entities.Policia;

import java.util.List;

@Repository
public interface IPoliciaRepository extends JpaRepository<Policia,Integer> {
    List<Policia> findByNumeroPlacaPolicia(String NroPlaca);
    @Query(value = "SELECT DISTINCT K.tipo_caso,\n" +
            "       C.numero_ciudadano AS DNI_Ciudadano,\n" +
            "\t   P.nombre_p AS Nombre_pertenencia,\n" +
            "       K.estado AS Descripcion_Caso_Sin_Atender,\n" +
            "       G.id_notificación AS Id_Notificacion\n" +
            "FROM tipo_caso AS K\n" +
            "LEFT JOIN notificacion AS G ON K.id_tipo_caso = G.id_tipo_caso\n" +
            "LEFT JOIN solicitar_ayuda AS A ON G.id_tipo_caso = A.id_tipo_caso\n" +
            "INNER JOIN pertenencias AS P ON A.id_ayuda = P.id_ayuda\n" +
            "INNER JOIN ciudadano AS C ON P.id_ciudadano = C.id_ciudadano \n" +
            "WHERE K.tipo_caso = 'no atendido';", nativeQuery = true)
    public List<String[]> finByDescripcionNotixCiudadano();
}
