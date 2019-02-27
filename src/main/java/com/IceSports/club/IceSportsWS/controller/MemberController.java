/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IceSports.club.IceSportsWS.controller;

import com.IceSports.club.IceSportsWS.entity.Member;
import com.IceSports.club.IceSportsWS.service.MemberImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mehdi
 */
@RestController
public class MemberController {
    
    @Autowired
    private MemberImpl memberService;
    
    @GetMapping(path = "/members")
    public List<Member> getMembers(){
        return memberService.findAll();
    }
    
    @GetMapping(path = "/members/{id}")
    public Member getMember(@PathVariable(name = "id") Long memberId){
        return memberService.findOne(memberId);
    }
    
    @PostMapping(path = "/member/create")
    public Member postMember(@RequestBody Member member){
        return memberService.createMember(member);
    }
    
    @PutMapping(path = "/member/update")
    public Member putMember(@RequestBody Member member){
        return memberService.updateMember(member);
    }
    
    @DeleteMapping(path = "/member/delete")
    public Member deleteMember(@RequestBody Member member){
        return memberService.deleteMember(member);
    }
}
