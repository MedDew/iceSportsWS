/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.service;

import com.IceSports.club.IceSportsWS.entity.Member;
import com.IceSports.club.IceSportsWS.repository.MemberRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Mehdi
 */
public class MemberImpl implements MemberInterface{
    
    @Autowired
    private MemberRepository memberRepo;
    
    @Override
    public List<Member> findAll() {
        List<Member> memberList =  memberRepo.findAll();
        return memberList;
    }

    @Override
    public Member findOne(Long id) {
        Member foundMember = memberRepo.getOne(id);
        return foundMember;
    }

    @Override
    public Member createMember(Member member) {
        Member createdMember = memberRepo.save(member);
        return createdMember;
    }

    @Override
    public Member updateMember(Member member) {
        Optional<Member> memberFound = memberRepo.findById(member.getId());
        Member memberToUpdate = memberFound.get();
        
        //Update date of birth
        memberToUpdate.setDateOfBirth(member.getDateOfBirth());
        
        //Update firstname
        memberToUpdate.setFirstname(member.getFirstname());
        
        //Update lastname
        memberToUpdate.setLastname(member.getLastname());
        
        //Update lastname
        memberToUpdate.setLastname(member.getLastname());
        
        //Update mail
        memberToUpdate.setMail(member.getMail());
        
        //Update activity
        memberToUpdate.setActivity(member.getActivity());
        
        //Update gender
        memberToUpdate.setGender(member.getGender());
        
        //memberRepo.save(memberToUpdate);
        return memberToUpdate;        
    }

    @Override
    public Member deleteMember(Member member) {
        Optional<Member> memberFound = memberRepo.findById(member.getId());
        Member memberToDelete = memberFound.get();
        
        memberRepo.delete(memberToDelete);
        return memberToDelete;
    }
    
}
