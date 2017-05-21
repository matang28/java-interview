package com.fiixapp.data;

import com.fiixapp.enums.Gender;
import com.fiixapp.enums.Religion;
import com.fiixapp.models.UserModel;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * In-Memory User's Database
 */
public class UserDatabase {

    /**
     * Call this method to generate the users.
     */
    public static List<UserModel> generateUsers(){
        List<UserModel> out = new ArrayList<UserModel>();

        for(int i=0;i<1000;i++){
            out.add(new UserModel(
                    (long)i,
                    MessageFormat.format("User{0}", String.valueOf(i)),
                    generateGender(i),
                    generateReligion(i),
                    generateAddress(i),
                    generateDob(i)
            ));
        }

        return out;
    }

    private static Gender generateGender(int i){
        if(i%2==0){
            return Gender.MALE;
        }
        else if(i%3==0){
            return Gender.FEMALE;
        }
        else{
            return Gender.UNKNOWN;
        }
    }

    private static Religion generateReligion(int i){
        if(i%2==0){
            return Religion.JEWISH;
        }
        else if(i%3==0){
            return Religion.CHRISTIAN;
        }
        else if(i%5==0){
            return Religion.MUSLIM;
        }
        else{
            return Religion.JEWISH;
        }
    }

    private static LocalDateTime generateDob(int i){
        return LocalDateTime.of(
                1980 + (i%25),
                Month.AUGUST,
                1,
                0,
                0
        );
    }

    private static String generateAddress(int i){
        if(i%2==0){
            return "Tel-Aviv";
        }
        else if(i%3==0){
            return "Beer-Sheva";
        }
        else if(i%5==0){
            return "Petch-Tikva";
        }
        else{
            return "Rehovot";
        }
    }

}
