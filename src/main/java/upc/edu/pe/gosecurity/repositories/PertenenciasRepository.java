package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.Pertenencias;

import java.util.List;

@Repository
public interface PertenenciasRepository extends JpaRepository <Pertenencias,Integer> {
    List<Pertenencias>findByNamePertenencias(String namePertenencias);
}

