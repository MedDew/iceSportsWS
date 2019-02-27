/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.controller;

import com.IceSports.club.IceSportsWS.entity.AdminUser;
import com.IceSports.club.IceSportsWS.service.AdminUserImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mehdi
 */
@RestController
public class AdminUserController {
    
    @Autowired
    private AdminUserImpl adminUserService;
    
    @GetMapping(path = "/adminusers")
    public List<AdminUser> getAdminUsers(){
        return adminUserService.findAll();
    }
    
    @GetMapping(name = "/adminusers/{id}")
    public AdminUser getAdminUser(@PathVariable(name = "id") Long adminUserId){
        return adminUserService.findOne(adminUserId);
    }
    
    @PostMapping(path = "/adminuser/create")
    public AdminUser postAdminUser(@RequestBody AdminUser adminUser){
        return adminUserService.createAdmiUser(adminUser);
    }
    
    @PutMapping(path = "/adminuser/update")
    public AdminUser putAdminUser(@RequestBody AdminUser adminUser){
        return adminUserService.updateAdmiUser(adminUser);
    }
    
    @PutMapping(path = "/adminuser/update-password")
    public AdminUser putAdminUserPassword(@RequestBody AdminUser adminUser){
        return adminUserService.updateAdmiUserPassword(adminUser);
    }
    
    @DeleteMapping(path = "/adminuser/delete")
    public AdminUser deleteAdminUser(AdminUser adminUser){
        return adminUserService.deleteAdmiUser(adminUser);
    }
}
