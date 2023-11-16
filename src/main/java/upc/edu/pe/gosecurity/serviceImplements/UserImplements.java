package upc.edu.pe.gosecurity.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.gosecurity.entities.Users;
import upc.edu.pe.gosecurity.repositories.UserRepository;
import upc.edu.pe.gosecurity.servicesInterfaces.UsersService;

import java.util.List;

@Service
public class UserImplements implements UsersService {
    @Autowired
    private UserRepository uR;
    @Override
    public Integer insert(Users user) {
        int rpta = uR.buscarUsername(user.getUsername());
        if (rpta == 0) {
            uR.save(user);
        }
        return rpta;
    }

    @Override
    public List<Users> list() {
        // TODO Auto-generated method stub
        return uR.findAll();
    }

    @Override
    public Users findLastUser() {
        return uR.findLastUser();
    }
}
