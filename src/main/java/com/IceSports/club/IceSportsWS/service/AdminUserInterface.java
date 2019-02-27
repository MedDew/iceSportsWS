/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.service;

import com.IceSports.club.IceSportsWS.entity.AdminUser;
import java.util.List;

/**
 *
 * @author Mehdi
 */
public interface AdminUserInterface {
    public List<AdminUser> findAll();
    
    public AdminUser findOne(Long id);
    
    public AdminUser createAdmiUser(AdminUser adminUser);
    
    public AdminUser updateAdmiUser(AdminUser adminUser);

    public AdminUser updateAdmiUserPassword(AdminUser adminUser);
    
    public AdminUser deleteAdmiUser(AdminUser adminUser);
}

