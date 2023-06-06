package com.example.avihs.UserList;

//import jakarta.persistence.*;

//@Entity
//@Table(name = "users")
public class Users {
    //This Class is used to make the modal object of the Users list
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "userID")
    private int userID;
    private String emailID;
    private long contact;

    public Users(int userID, String emailID, long contact){
        this.userID = userID;
        this.emailID = emailID;
        this.contact = contact;
    }
    public Users(){    }

    public int getUserID() {
        return userID;
    }

    public void setUserID() {
        this.userID = userID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", emailID='" + emailID + '\'' +
                ", contact=" + contact +
                '}';
    }
}
