/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.service;

import com.IceSports.club.IceSportsWS.entity.AdminUser;
import com.IceSports.club.IceSportsWS.repository.AdminUserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mehdi
 */
@Service
public class AdminUserImpl implements AdminUserInterface{

    @Autowired
    private AdminUserRepository adminUserRepo;
    
    @Override
    public List<AdminUser> findAll() {
        List<AdminUser> adminUserList = adminUserRepo.findAll();
        return adminUserList;
    }

    @Override
    public AdminUser findOne(Long id) {
        AdminUser adminUser = adminUserRepo.getOne(id);
        return adminUser;
    }

    @Override
    public AdminUser createAdmiUser(AdminUser adminUser) {
        AdminUser adminUserCreated = adminUserRepo.save(adminUser);
        return adminUserCreated;
    }

    @Override
    public AdminUser updateAdmiUser(AdminUser adminUser) {
        Optional<AdminUser> adminUserFound = adminUserRepo.findById(adminUser.getId());
        AdminUser adminUserToUpdate = adminUserFound.get();
        
        //Update last name
        adminUserToUpdate.setLastName(adminUser.getLastName());
        
        //Update mail
        adminUserToUpdate.setMail(adminUser.getLastName());
        
        //adminUserRepo.save(adminUserToUpdate);
        return adminUserToUpdate;
    }
    
    @Override
    public AdminUser updateAdmiUserPassword(AdminUser adminUser) {
        Optional<AdminUser> adminUserFound = adminUserRepo.findById(adminUser.getId());
        AdminUser adminUserToUpdate = adminUserFound.get();
        
        //Update password
        adminUserToUpdate.setPassword(adminUser.getPassword());
        adminUserToUpdate.setSalt(adminUser.getSalt());
        
        //adminUserRepo.save(adminUserToUpdate);
        return adminUserToUpdate;
    }

    @Override
    public AdminUser deleteAdmiUser(AdminUser adminUser) {
        Optional<AdminUser> adminUserFound = adminUserRepo.findById(adminUser.getId());
        AdminUser adminUserToDelete = adminUserFound.get();
        
        adminUserRepo.delete(adminUserToDelete);
        return adminUserToDelete;
    }
}
