package com.revature.LibraryApp.daos;

import com.revature.LibraryApp.models.Member;
import com.revature.LibraryApp.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {


    public List<Member> findAll() {
        List<Member> members = new ArrayList<>();

        try(Connection connection = ConnectionFactory.getConnectionFactory().getConnection()){
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM members";

            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                Member member = new Member();
                member.setMemberId(resultSet.getInt("member_id"));
                member.setName(resultSet.getString("name"));
                member.setEmail(resultSet.getString("email"));
                member.setPassword(resultSet.getString("password"));
                members.add(member);
            }

            return members;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public Member create(Member member) {
        return null;
    }

    public Member update(Member member) {

        return null;
    }

    public boolean delete(int memberId) {
        return false;
    }
}
