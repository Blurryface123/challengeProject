package com.andres.repository;

import com.andres.entity.dota2.Results;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface gamesRepository {

    @Repository
    public interface dota2Repository extends CrudRepository<Results, Long>{}

   // public csgoRepository extends CrudRepository<Result, Long>{};

}
