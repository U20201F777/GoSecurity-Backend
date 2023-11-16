package upc.edu.pe.gosecurity.servicesInterfaces;

import upc.edu.pe.gosecurity.entities.Users;

import java.util.List;

public interface UsersService {
    public Integer insert(Users user);
    List<Users> list();
    Users findLastUser();
}
