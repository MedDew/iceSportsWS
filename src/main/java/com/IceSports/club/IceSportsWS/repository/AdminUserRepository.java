/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.repository;

import com.IceSports.club.IceSportsWS.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Mehdi
 */
public interface AdminUserRepository extends JpaRepository<AdminUser, Long>{
    
}
