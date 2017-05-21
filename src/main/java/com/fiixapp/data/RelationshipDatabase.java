package com.fiixapp.data;

import com.fiixapp.enums.RelationshipType;
import com.fiixapp.models.RelationshipModel;
import com.fiixapp.models.UserModel;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * In-Memory Relationships Database
 */
public class RelationshipDatabase {

    /**
     * Call this method to generate the relationships.
     */
    public static List<RelationshipModel> generateRelationships(){

        List<RelationshipModel> out = new ArrayList<>();

        List<UserModel> usersList = UserDatabase.generateUsers();

        for(int j=0, i=0;j<10;j++){
            for(int a=0;a<usersList.size();a++){
                for(int b=usersList.size()-1;b>=0;b--){
                    if(a!=b){
                        out.add(new RelationshipModel((long)a+b, (long)a, (long)b, generateRelationshipType(a+b), LocalDateTime.of(2017, Month.AUGUST, 1, 2, 0)));
                        i++;
                    }
                }
            }
        }

        return out;
    }

    private static RelationshipType generateRelationshipType(int n){
        if(n%2==0){
            return RelationshipType.VIEW;
        }
        else if(n%3==0){
            return RelationshipType.LIKE;
        }
        else if(n%5==0){
            return RelationshipType.BLOCK;
        }
        else{
            return RelationshipType.MESSAGE;
        }

    }

}
