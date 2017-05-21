package com.fiixapp.models;

import com.fiixapp.enums.Gender;
import com.fiixapp.enums.Religion;

import java.time.LocalDateTime;

/**
 * This is how a user looks like...
 */
public class UserModel extends Entity<Long>{

    private String name;
    private Gender gender;

    private Religion religion;

    private String address;

    private LocalDateTime dateOfBirth;

    public UserModel(Long id, String name, Gender gender, Religion religion, String address, LocalDateTime dateOfBirth) {
        super(id);
        this.name = name;
        this.gender = gender;
        this.religion = religion;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public Religion getReligion() {
        return religion;
    }
}
