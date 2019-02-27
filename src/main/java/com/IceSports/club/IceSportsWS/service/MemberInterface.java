/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.service;

import com.IceSports.club.IceSportsWS.entity.Member;
import java.util.List;

/**
 *
 * @author Mehdi
 */
public interface MemberInterface {
    List<Member> findAll();
    
    Member findOne(Long id);
    
    Member createMember(Member member);
    
    Member updateMember(Member member);
    
    Member deleteMember(Member member);
}
