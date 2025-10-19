package edu.uth.evdatamarketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import edu.uth.evdatamarketplace.model.Role;
import edu.uth.evdatamarketplace.repository.RoleRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private RoleRepository roleRepo;

    // API để thêm role mới (GET cho tiện test)
    @GetMapping("/addRole")
    public String addRole(@RequestParam String name) {
        Role role = new Role();
        role.setName(name);
        roleRepo.save(role);
        return "Role '" + name + "' added successfully!";
    }

    // API để xem danh sách tất cả roles
    @GetMapping("/roles")
    public List<Role> getAllRoles() {
        return roleRepo.findAll();
    }
}
