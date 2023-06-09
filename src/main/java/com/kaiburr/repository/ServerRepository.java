package com.kaiburr.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kaiburr.model.Server;

@Repository
public interface ServerRepository extends MongoRepository<Server, Long> {

}
