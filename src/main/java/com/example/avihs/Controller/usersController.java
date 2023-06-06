package com.example.avihs.Controller;
import com.example.avihs.UserList.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.avihs.Services.userServices;

import java.util.List;

@RestController
public class usersController {
    @Autowired
    private userServices userServices;

    @GetMapping("/users")       //OR @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Users> getUsers(){
        return this.userServices.getAllUsers();
    }
    @GetMapping("/users/{userID}")
    public Users getUsers(@PathVariable("userID") int userID){
        return userServices.getUserById(userID) ;
    }
    @PostMapping("/users")
    public Users addUsers(@RequestBody Users users){
        Users u = this.userServices.addUser(users);
        return u;
    }
    @DeleteMapping("/users/{userID}")
    public void deleteUser(@PathVariable("userID") int userID){
        this.userServices.deleteUser(userID);
    }
    //update users data
    @PutMapping("/users/{userID}")
    public Users updateUser(@RequestBody Users users, @PathVariable("userID") int userID){
        System.out.println("--------------------------------put requestleflkadsjfladsjflad");
        this.userServices.updateUser(users,userID);
        return users;
    }
}
