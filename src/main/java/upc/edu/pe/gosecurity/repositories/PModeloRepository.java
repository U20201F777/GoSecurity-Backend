package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.PertenenciasModelo;

import java.util.List;

@Repository
public interface PModeloRepository extends JpaRepository <PertenenciasModelo,Integer> {
}
