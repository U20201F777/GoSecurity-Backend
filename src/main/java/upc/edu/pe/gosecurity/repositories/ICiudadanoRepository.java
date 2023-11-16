package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.Ciudadano;

import java.util.List;

@Repository
public interface ICiudadanoRepository extends JpaRepository<Ciudadano,Integer> {
    List<Ciudadano> findByNumeroCiudadano(int dniCiudadano);
    @Query("from Ciudadano v where v.users.username =:username")
    Ciudadano listByUser(String username);
}
