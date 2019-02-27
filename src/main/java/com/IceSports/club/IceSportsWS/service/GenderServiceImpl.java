/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.service;

import com.IceSports.club.IceSportsWS.entity.Gender;
import com.IceSports.club.IceSportsWS.repository.GenderRepository;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mehdi
 */
@Service
public class GenderServiceImpl  implements GenderInterface{

    @Autowired
    private GenderRepository genderRepo;
    
    @Override
    public Set<Gender> findAll() {
        List<Gender> genderList = genderRepo.findAll();
        Set<Gender> genderSet = genderList.stream().collect(Collectors.toSet());
        return genderSet;
    }
    
}
