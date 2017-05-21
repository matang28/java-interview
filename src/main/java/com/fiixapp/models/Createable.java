package com.fiixapp.models;

import java.time.LocalDateTime;

/**
 * Created by Matan on 21-May-17.
 * Property of Fiix Application ltd.
 */
public abstract class Createable<T> extends Entity<T> {

    private LocalDateTime created;

    public Createable(T id, LocalDateTime created) {
        super(id);
        this.created = created;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
