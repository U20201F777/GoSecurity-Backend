package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.gosecurity.entities.Denuncias;

@Repository
public interface IDenunciasRepository extends JpaRepository<Denuncias,Integer> {
}
