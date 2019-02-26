/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mehdi
 */
@Entity
@Getter
@Setter
public class AdminUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_user_seq")
    @SequenceGenerator(name = "admin_user_seq", sequenceName = "admin_user_seq", allocationSize = 1)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
    
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;
    
    @Column(name = "mail", nullable = false, length = 70)
    private String mail;
    
    @Column(name = "salt", nullable = false, length = 20)
    private String salt;
    
    @Column(name = "password", nullable = false, length = 70)
    private String password;
}
