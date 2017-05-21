package com.fiixapp.models;

/**
 * An entity is something with id
 */
public abstract class Entity<T> {

    private final T id;

    Entity(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
