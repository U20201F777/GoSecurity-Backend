package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.PertenenciasColor;

@Repository
public interface PColorRepository extends JpaRepository <PertenenciasColor,Integer> {
}
