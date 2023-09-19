package upc.edu.pe.gosecurity.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "id_Usuario", "rol" }) })
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String rol;
	
	@ManyToOne
	@JoinColumn(name="id_Usuario", nullable=false)
	private Usuario id_Usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Usuario getId_Usuario() {
		return id_Usuario;
	}

	public void setIdUsuario(Usuario id_Usuario) {
		this.id_Usuario = id_Usuario;
	}
}