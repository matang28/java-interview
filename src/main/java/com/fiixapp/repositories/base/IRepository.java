package com.fiixapp.repositories.base;

import com.fiixapp.models.Entity;

import java.util.List;

/**
 * Created by Matan on 21-May-17.
 * Property of Fiix Application ltd.
 */
public interface IRepository<K, T extends Entity<K>> {

    /**
     * @return the whole data set.
     */
    List<T> getAll();

    /**
     * @param id The id of the entity.
     * @return the entity object.
     */
    T findById(K id);

}
