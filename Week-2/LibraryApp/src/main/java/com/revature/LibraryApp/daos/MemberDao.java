package com.revature.LibraryApp.daos;

import com.revature.LibraryApp.models.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {

    private List<Member> members = new ArrayList<>();

    // temporary default database b4 jdbc
    {
        members.add(new Member(1, "John Doe", "johndoe@mail.com", "password"));
        members.add(new Member(1, "Jane Doe", "janedoe@mail.com", "password"));
    }

    public List<Member> findAll() {
        return members;
    }
}
