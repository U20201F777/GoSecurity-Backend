package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.Role;
import upc.edu.pe.gosecurity.repositories.RoleRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.RoleService;

import java.util.List;

@Service
public class RoleImplement implements RoleService {
    @Autowired
    private RoleRepository rR;
    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }
}
