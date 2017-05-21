package com.fiixapp.models;

import com.fiixapp.enums.RelationshipType;

import java.time.LocalDateTime;

/**
 * Created by Matan on 21-May-17.
 * Property of Fiix Application ltd.
 */
public class RelationshipModel extends Createable<Long>{

    private final Long fromId;
    private final Long toId;
    private final RelationshipType type;

    public RelationshipModel(Long id, Long fromId, Long toId, RelationshipType type, LocalDateTime created) {
        super(id, created);
        this.fromId = fromId;
        this.toId = toId;
        this.type = type;
    }

    public Long getFromId() {
        return fromId;
    }

    public Long getToId() {
        return toId;
    }

}
