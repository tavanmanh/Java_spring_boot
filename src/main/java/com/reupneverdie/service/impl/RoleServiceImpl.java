package com.reupneverdie.service.impl;

import com.reupneverdie.model.Role;
import com.reupneverdie.repo.RoleRepository;
import com.reupneverdie.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role create(Role role) {
        if (role.getName() == null  || role.getName().isEmpty()) {
            return null;
        }

        return roleRepository.save(role);
    }

    @Override
    public Role update(Long id, Role user) {
        Role fromDB = roleRepository.findById(id).orElse(null);
        if (fromDB == null) {
            return null;
        }
        fromDB.setName(user.getName());
        return roleRepository.save(fromDB);
    }

    @Override
    public void delete(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Role findById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Role> findAll() {
        return roleRepository.findAll();
    }


}
