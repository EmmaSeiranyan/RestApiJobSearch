package com.myrest.repositories.mongo;

import com.myrest.schema.Merch;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;;

public interface IMerchRepository extends MongoRepository<Merch, String>{
    List<Merch> findByMerch(@Param("name") String name);

}
