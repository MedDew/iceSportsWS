/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.service;

import com.IceSports.club.IceSportsWS.entity.Activity;
import com.IceSports.club.IceSportsWS.repository.ActivityRepository;
import java.util.Arrays;
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
public class ActivityServiceImpl implements ActivityInterface{

    @Autowired
    private ActivityRepository activityRepo;
    
    @Override
    public Set<Activity> findAll() {
        List<Activity> activityList = activityRepo.findAll();
        Set<Activity> activitySet = activityList.stream().collect(Collectors.toSet());
        return activitySet;
    }
    
}
