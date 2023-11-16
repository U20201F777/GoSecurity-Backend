package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.Policia;

import java.util.List;

@Repository
public interface IPoliciaRepository extends JpaRepository<Policia,Integer> {
    List<Policia> findByNumeroPlacaPolicia(String NroPlaca);
    @Query("from Policia v where v.users.username =:username")
    Policia listByUser(String username);
    @Query(value = "SELECT \n" +
            "    C.numero_ciudadano AS DNI_Ciudadano,\n" +
            "    P.nombre_p AS Nombre_pertenencia,\n" +
            "    COUNT(CASE WHEN K.tipo_caso = 'atendido' THEN P.id_pertenencias ELSE NULL END) AS Cant_Atendido,\n" +
            "    COUNT(CASE WHEN K.tipo_caso = 'no atendido' THEN P.id_pertenencias ELSE NULL END) AS Cant_No_Atendido\n" +
            "FROM \n" +
            "    tipo_caso AS K\n" +
            "LEFT JOIN \n" +
            "    notificacion AS G ON K.id_tipo_caso = G.id_tipo_caso\n" +
            "LEFT JOIN \n" +
            "    ayuda AS A ON G.id_tipo_caso = A.id_tipo_caso\n" +
            "INNER JOIN \n" +
            "    pertenencias AS P ON A.id_ayuda = P.id_ayuda\n" +
            "INNER JOIN \n" +
            "    ciudadano AS C ON P.id_ciudadano = C.id_ciudadano\n" +
            "WHERE \n" +
            "    K.tipo_caso IN ('atendido', 'no atendido')\n" +
            "GROUP BY \n" +
            "    C.numero_ciudadano, P.nombre_p;", nativeQuery = true)
    public List<String[]> casosPorTipo();
}
