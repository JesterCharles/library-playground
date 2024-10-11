package com.revature.LibraryApp.services;

import com.revature.LibraryApp.daos.MemberDao;
import com.revature.LibraryApp.models.Member;

import java.util.List;

public class MemberService {

    private final MemberDao memberDao;

    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }


    public List<Member> getAllMembers() {
        return memberDao.findAll();
    }
}
