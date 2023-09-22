package upc.edu.pe.gosecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import upc.edu.pe.gosecurity.entities.Usuario;
@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Long> {
    public Usuario findByUsername (String username);

    @Query("select count(u.username) from Usuario u where u.username =:username")
    public int buscarUsername(@Param("username") String username);

    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, id_Usuario) VALUES (:rol, :id_Usuario)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("id_Usuario") Long id_Usuario);
}
