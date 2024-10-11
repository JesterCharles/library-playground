package com.revature.LibraryApp.controllers;

import com.revature.LibraryApp.models.Member;
import com.revature.LibraryApp.services.MemberService;

import java.util.List;

public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
}
