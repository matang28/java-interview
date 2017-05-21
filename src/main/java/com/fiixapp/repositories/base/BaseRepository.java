package com.fiixapp.repositories.base;

import com.fiixapp.models.Entity;

import java.util.List;

/**
 * Created by Matan on 21-May-17.
 * Property of Fiix Application ltd.
 */
public abstract class BaseRepository<K, T extends Entity<K>> implements IRepository<K, T> {

    protected List<T> datalist;

}
