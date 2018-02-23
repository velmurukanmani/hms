package com.bloomtree.employee.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.bloomtree.employee.model.TestUser;
import com.bloomtree.employee.service.UserService;
 
@RestController
public class UserController {
 
    @Autowired
    UserService userService;  //Service which will do all data retrieval/manipulation work
 
    
    //-------------------Retrieve All Users--------------------------------------------------------
     
    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<TestUser>> listAllUsers() {
        List<TestUser> users = userService.findAllUsers();
        
        if(users.isEmpty()){
            return new ResponseEntity<List<TestUser>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<TestUser>>(users, HttpStatus.OK);
    }
 
 
    
    //-------------------Retrieve Single TestUser--------------------------------------------------------
     
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TestUser> getUser(@PathVariable("id") long id) {
        System.out.println("Fetching TestUser with id " + id);
        TestUser user = userService.findById(id);
        if (user == null) {
            System.out.println("TestUser with id " + id + " not found");
            return new ResponseEntity<TestUser>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<TestUser>(user, HttpStatus.OK);
    }
 
     
     
    //-------------------Create a TestUser--------------------------------------------------------
     
    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody TestUser user,    UriComponentsBuilder ucBuilder) {
        System.out.println("Creating TestUser " + user.getUsername());
 
        if (userService.isUserExist(user)) {
            System.out.println("A TestUser with name " + user.getUsername() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
 
        userService.saveUser(user);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
 
    
     
    //------------------- Update a TestUser --------------------------------------------------------
     
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<TestUser> updateUser(@PathVariable("id") long id, @RequestBody TestUser user) {
        System.out.println("Updating TestUser " + id);
         
        TestUser currentUser = userService.findById(id);
         
        if (currentUser==null) {
            System.out.println("TestUser with id " + id + " not found");
            return new ResponseEntity<TestUser>(HttpStatus.NOT_FOUND);
        }
 
        currentUser.setUsername(user.getUsername());
        currentUser.setAddress(user.getAddress());
        currentUser.setEmail(user.getEmail());
         
        userService.updateUser(currentUser);
        return new ResponseEntity<TestUser>(currentUser, HttpStatus.OK);
    }
 
    
    
    //------------------- Delete a TestUser --------------------------------------------------------
     
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<TestUser> deleteUser(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting TestUser with id " + id);
 
        TestUser user = userService.findById(id);
        if (user == null) {
            System.out.println("Unable to delete. TestUser with id " + id + " not found");
            return new ResponseEntity<TestUser>(HttpStatus.NOT_FOUND);
        }
 
        userService.deleteUserById(id);
        return new ResponseEntity<TestUser>(HttpStatus.NO_CONTENT);
    }
 
     
    
    //------------------- Delete All Users --------------------------------------------------------
     
    @RequestMapping(value = "/user/", method = RequestMethod.DELETE)
    public ResponseEntity<TestUser> deleteAllUsers() {
        System.out.println("Deleting All Users");
 
        userService.deleteAllUsers();
        return new ResponseEntity<TestUser>(HttpStatus.NO_CONTENT);
    }
 
}