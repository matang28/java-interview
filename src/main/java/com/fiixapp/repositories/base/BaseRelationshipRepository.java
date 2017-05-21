package com.fiixapp.repositories.base;

import com.fiixapp.data.RelationshipDatabase;
import com.fiixapp.models.RelationshipModel;

/**
 * Created by Matan on 21-May-17.
 * Property of Fiix Application ltd.
 */
public abstract class BaseRelationshipRepository extends BaseRepository<Long, RelationshipModel>{

    public BaseRelationshipRepository() {
        this.datalist = RelationshipDatabase.generateRelationships();
    }
}
