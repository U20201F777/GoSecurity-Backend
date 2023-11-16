package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.Role;

import java.util.List;

public interface RoleService {
    public void insert(Role role);
    List<Role> list();
}
