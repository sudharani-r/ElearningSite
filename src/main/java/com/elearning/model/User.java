package com.elearning.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
 
 

@Document(collection="user")
public class User {
 
    @Id
    @Field
    private String id;
    @Field
    private String userId;
    @Field
    private String firstName;
    @Field
    private String lastName;
    @Field
    private String contactAddr;
    @Field
    private String mobileNumber;
     
 
    public String getUserId() {
        return userId;
    }
 
    public void setUserId(String userId) {
        this.userId = userId;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getContactAddr() {
        return contactAddr;
    }
 
    public void setContactAddr(String contactAddr) {
        this.contactAddr = contactAddr;
    }
 
    
    public String getMobileNumber() {
        return mobileNumber;
    }
 
   
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
 
}
