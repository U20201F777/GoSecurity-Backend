package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.Comisaria;

import java.util.List;
@Repository
public interface ComisariaRepository extends JpaRepository<Comisaria, Integer> {
    @Query(value = "SELECT C.id_comisaria, \n" +
            "       C.nombre_c AS Nombre_comisaria,\n" +
            "       COUNT(DISTINCT P.id_policia) AS Cantidad_de_policias,\n" +
            "\t   COUNT(DISTINCT A.id_denuncias) AS Cantidad_denuncias\n" +
            "FROM Comisaria AS C\n" +
            "INNER JOIN Policia AS P ON C.id_comisaria = P.id_comisaria\n" +
            "INNER JOIN Denuncias AS A ON A.id_comisaria = A.id_comisaria\n" +
            "GROUP BY C.id_comisaria, C.nombre_c;", nativeQuery = true)
    public List<String[]> FindByDenunciasComisariaPolicia();
}
