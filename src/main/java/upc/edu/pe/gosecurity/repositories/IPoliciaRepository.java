package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.Pertenencias;
import upc.edu.pe.gosecurity.entities.Policia;

import java.util.List;

@Repository
public interface IPoliciaRepository extends JpaRepository<Policia,Integer> {
    List<Policia> findByNumeroPlacaPolicia(String NroPlaca);
}
