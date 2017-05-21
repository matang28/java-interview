package com.fiixapp.repositories.base;

import com.fiixapp.data.UserDatabase;
import com.fiixapp.models.UserModel;

/**
 * Created by Matan on 21-May-17.
 * Property of Fiix Application ltd.
 */
public abstract class BaseUserRepository extends BaseRepository<Long, UserModel>{

    public BaseUserRepository() {
        this.datalist = UserDatabase.generateUsers();
    }

}
