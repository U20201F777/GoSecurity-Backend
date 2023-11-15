package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.Ciudadano;

import java.util.List;

@Repository
public interface ICiudadanoRepository extends JpaRepository<Ciudadano,Integer> {
    List<Ciudadano> findByNumeroCiudadano(int dniCiudadano);
}
