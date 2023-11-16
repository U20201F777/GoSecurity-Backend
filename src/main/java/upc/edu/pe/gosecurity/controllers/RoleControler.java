package upc.edu.pe.gosecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import upc.edu.pe.gosecurity.entities.Role;
import upc.edu.pe.gosecurity.servicesInterfaces.RoleService;
import upc.edu.pe.gosecurity.servicesInterfaces.UsersService;

@Controller
@SessionAttributes
@RequestMapping("/roles")
public class RoleControler {
    @Autowired
    private UsersService uS;
    @Autowired
    private RoleService rS;
    @GetMapping("/new")
    public String newRole(Model model) {
        model.addAttribute("role", new Role());
        model.addAttribute("listaUsuarios", uS.list());
        return "role/role";
    }
    @PostMapping("/save")
    public String saveRole(@Validated Role role, BindingResult result, Model model, SessionStatus status) throws Exception {
        if (result.hasErrors()) {
            return "role/role";
        } else {
            rS.insert(role);
            model.addAttribute("mensaje", "Se guardó correctamente");
            status.setComplete();
        }
        model.addAttribute("listaRoles", rS.list());
        return "role/role";
    }
    @GetMapping("/list")
    public String listRole(Model model) {
        try {
            model.addAttribute("role", new Role());
            model.addAttribute("listaRoles", rS.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "role/listRole";
    }
}