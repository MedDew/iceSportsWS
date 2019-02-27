/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.controller;

import com.IceSports.club.IceSportsWS.entity.AdminUser;
import com.IceSports.club.IceSportsWS.service.AdminUserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mehdi
 */
@RestController
public class AdminUserController {
    
    @Autowired
    private AdminUserImpl adminUserService;
    
    @GetMapping(name = "/adminusers")
    public List<AdminUser> getAdminUsers(){
        return adminUserService.findAll();
    }
}
