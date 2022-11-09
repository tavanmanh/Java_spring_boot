package com.reupneverdie.controller;

import com.reupneverdie.model.Role;
import com.reupneverdie.service.RoleService;
import com.reupneverdie.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleServiceImpl roleService;

    @PostMapping
    public Role create(@RequestBody Role user) {
        return roleService.create(user);
    }

    @PutMapping("/{id}")
    public Role update(@PathVariable Long id, @RequestBody Role role) {
        return roleService.update(id, role);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        roleService.delete(id);
    }

    @GetMapping
    public Iterable<Role> findAll() {
        return roleService.findAll();
    }

    @GetMapping("/{id}")
    public Role findByID(@PathVariable Long id) {
        return roleService.findById(id);
    }
}

