package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.Denuncias;

import java.util.List;

@Repository
public interface IDenunciasRepository extends JpaRepository<Denuncias,Integer> {
    @Query(value = "SELECT C.id_ciudadano, \n" +
            "       C.numero_ciudadano AS DNI_Ciudadano,\n" +
            "       COUNT(A.id_denuncias) AS Cantidad_de_Denuncias\n" +
            "FROM ciudadano AS C\n" +
            "INNER JOIN denuncias AS A ON C.id_ciudadano = A.id_ciudadano\n" +
            "GROUP BY C.id_ciudadano, C.numero_ciudadano;", nativeQuery = true)
    public List<String[]> DenunciasxCiudadano();
}
