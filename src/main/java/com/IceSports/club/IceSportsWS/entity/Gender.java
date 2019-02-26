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
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gender_seq")
    @SequenceGenerator(name = "gender_seq", sequenceName = "gender_seq", allocationSize = 1)
    @Column(nullable = false, updatable = false)
    private Long id;
    
    @Column(length = 8, nullable = false)
    private String genderLabel;
}
