package com.shopmanager.repositories;

import com.shopmanager.entities.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item,String> {
}
