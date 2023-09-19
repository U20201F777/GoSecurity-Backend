package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.PertenenciasMarca;

import java.util.List;

@Repository
public interface PMarcaRepository extends JpaRepository <PertenenciasMarca,Integer> {
    List<PertenenciasMarca>findByNamePertenenciasMarca(String namePertenenciasMarca);
}

