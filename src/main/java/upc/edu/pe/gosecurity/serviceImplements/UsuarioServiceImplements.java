package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.Usuario;
import upc.edu.pe.gosecurity.repositories.IUsuarioRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplements implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUsuario) {
        uR.deleteById(idUsuario);
    }
}
