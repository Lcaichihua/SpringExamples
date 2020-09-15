package com.cavetech.seiya.crudMongoSwagger.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cavetech.seiya.crudMongoSwagger.models.ProductDTO;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String>{

}
