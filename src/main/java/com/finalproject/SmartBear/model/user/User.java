package com.finalproject.SmartBear.model.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.finalproject.SmartBear.model.rental.Rental;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity(name = "users")
public class User implements Serializable {  // admin, host, client  <-- with different roles;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String profileImageUrl;
    private String phoneNumber;
    private Date lastLoginDate;
    private Date lastLoginDateDisplay;
    private Date joinDate;
    private String role; // {user : read, user: edit, user: create};
    private String[] authorities; // admin, host, client
    private boolean isActive;
    private boolean isNotLocked;

    @OneToMany(mappedBy = "host")
    @JsonBackReference
    private Set<Rental> rentals = new HashSet<>();

    public User() {}

//    public User(String firstName, String lastName, String username, String password,
//                String email, String profileImageUrl, String phoneNumber, Date lastLoginDate,
//                Date lastLoginDateDisplay, Date joinDate, String role, String[] authorities, boolean isActive,
//                boolean isNotLocked, Set<Rental> rentals) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.profileImageUrl = profileImageUrl;
//        this.phoneNumber = phoneNumber;
//        this.lastLoginDate = lastLoginDate;
//        this.lastLoginDateDisplay = lastLoginDateDisplay;
//        this.joinDate = joinDate;
//        this.role = role;
//        this.authorities = authorities;
//        this.isActive = isActive;
//        this.isNotLocked = isNotLocked;
//        this.rentals = rentals;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLoginDateDisplay() {
        return lastLoginDateDisplay;
    }

    public void setLastLoginDateDisplay(Date lastLoginDateDisplay) {
        this.lastLoginDateDisplay = lastLoginDateDisplay;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String[] getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String[] authorities) {
        this.authorities = authorities;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isNotLocked() {
        return isNotLocked;
    }

    public void setNotLocked(boolean notLocked) {
        isNotLocked = notLocked;
    }

    public Set<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(Set<Rental> rentals) {
        this.rentals = rentals;
    }
}
