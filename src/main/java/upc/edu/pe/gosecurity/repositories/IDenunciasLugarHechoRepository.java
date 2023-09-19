package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.DenunciasLugarHecho;

import java.util.List;

@Repository
public interface IDenunciasLugarHechoRepository extends JpaRepository<DenunciasLugarHecho,Integer> {
    List<DenunciasLugarHecho> findByNameDenunciasLugarHecho(String nameDenunciasLugarHechoComisaria);
}
