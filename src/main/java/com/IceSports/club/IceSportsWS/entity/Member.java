/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
public class Member {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
    @SequenceGenerator(name = "member_seq", sequenceName = "member_seq", allocationSize = 1)
    @Column(nullable = false, updatable = false)
    private Long id;
    
    @Column(nullable = false, length = 50)
    private String firstname;
    
    @Column(nullable = false, length = 50)
    private String lastname;
    
    @Column(nullable = false)
    private Date dateOfBirth;
    
    @Column(nullable = false, length = 70)
    private String mail;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_id", nullable = false, foreignKey = @ForeignKey(name = "FK_ACTIVITY"))
    private Activity activity;
    
    @OneToOne()
    @JoinColumn(name = "gender_id", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_GENDER") )
    private Gender gender;
}
