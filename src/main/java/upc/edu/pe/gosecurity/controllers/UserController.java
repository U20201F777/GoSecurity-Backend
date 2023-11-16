package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.UsersDTO;
import upc.edu.pe.gosecurity.entities.Users;
import upc.edu.pe.gosecurity.servicesInterfaces.UsersService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UsersService uS;
    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Users());
            model.addAttribute("listaUsuarios", uS.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "userSecurity/listUser";
    }
    @GetMapping("/listar")
    public List<UsersDTO> List(){
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, UsersDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/insert")
    public void insert(@RequestBody UsersDTO dto){
        String bcryptPassword = passwordEncoder.encode(dto.getPassword());
        dto.setPassword(bcryptPassword);
        System.out.println(dto.getId());
        ModelMapper m=new ModelMapper();
        Users a=m.map(dto, Users.class);
        System.out.println(a.getId());
        uS.insert(a);
    }
    @GetMapping("/ultimoUser")
    public UsersDTO getLastUser() {
        Users lastUser = uS.findLastUser();
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(lastUser, UsersDTO.class);
    }
}
