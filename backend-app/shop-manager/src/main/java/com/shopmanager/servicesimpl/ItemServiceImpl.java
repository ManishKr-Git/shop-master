package com.shopmanager.servicesimpl;

import com.shopmanager.entities.Item;
import com.shopmanager.repositories.ItemRepository;
import com.shopmanager.services.I_ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements I_ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item addNewItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(String itemId) {
        return itemRepository.findById(itemId).orElseThrow();
    }

    @Override
    public Item updateItemById(Item item, String itemId) {
        return itemRepository.save(item);
    }
}
