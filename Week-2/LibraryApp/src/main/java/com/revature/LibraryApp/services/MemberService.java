package com.revature.LibraryApp.services;

import com.revature.LibraryApp.daos.MemberDao;
import com.revature.LibraryApp.models.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberService {

    private final MemberDao memberDao;

    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }


    public List<Member> getAllMembers() {
        return memberDao.findAll();
    }

    public Member createMember(Member member) {
        // TODO: IMPLEMENT VALIDATION to make sure the member is valid information associated with the business rules
        return memberDao.create(member);
    }

    public Member updateMember(int memberId, Member member) {
        // Simple validation step
        if(member.getMemberId() != memberId){
            return null;
        } else {
            return memberDao.update(member);
        }
    }

    public boolean deleteMember(int memberId) {
        return memberDao.delete(memberId);
    }
}
