package com.shopmanager.services;

import com.shopmanager.entities.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface I_ItemService {
    Item addNewItem(Item item);

    List<Item> getAllItems();

    Item getItemById(String itemId);

    Item updateItemById(Item item, String itemId);
}
