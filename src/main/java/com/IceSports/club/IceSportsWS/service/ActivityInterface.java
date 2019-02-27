/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.service;

import com.IceSports.club.IceSportsWS.entity.Activity;
import java.util.Set;

/**
 *
 * @author Mehdi
 */
public interface ActivityInterface {
    
    public Set<Activity> findAll();
}
