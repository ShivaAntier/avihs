package com.example.avihs.Services;

import com.example.avihs.UserList.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class userServices {
    private static List<Users> list = new ArrayList<>();
    static {
        list.add(new Users(2,"daffodiluniquerana777@gmail.com",987654456));
        list.add(new Users(3,"uniquerana777@gmail.com",987654));
        list.add(new Users(4,"rana777@gmail.com",987699999));
    }
    //get all user details
    public List<Users> getAllUsers(){
        return list;
    }
    //Get single user by id
    public Users getUserById(int userID){
        Users users = null;
        users = list.stream().filter(e->e.getUserID()==userID).findFirst().get();
        return users;
    }
    public Users addUser(Users u){
        list.add(u);
        return u;
    }
    public void deleteUser(int userID){

        list = list.stream().filter(users -> users.getUserID()!=userID).collect(Collectors.toList());
    }
    //Update the user
    public void updateUser(Users users, int userID){
        System.out.println("reachted jdfljadslfjadslf");
       list = list.stream().map(b->{
            if(b.getUserID()==userID){
                b.setEmailID(users.getEmailID());
                b.setContact(users.getContact());
            }
            return b;
        }).collect(Collectors.toList());
    }
}
