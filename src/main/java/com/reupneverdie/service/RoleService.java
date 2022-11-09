package com.reupneverdie.service;

import com.reupneverdie.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
        Role create(Role user);
        Role update(Long id, Role user);
        void delete(Long id);
        Role findById(Long id);
        Iterable<Role> findAll();

}


