package com.shopmanager.controllersimpl;

import com.shopmanager.controllers.I_ItemController;
import com.shopmanager.entities.Item;
import com.shopmanager.services.I_ItemService;
import com.shopmanager.servicesimpl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class
ItemControllerImpl implements I_ItemController {
    @Autowired
    I_ItemService itemService;

    @Override
    public Item addNewItem(Item item) {
        return itemService.addNewItem(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @Override
    public Item getItemById(String itemId) {
        return itemService.getItemById(itemId);
    }

    @Override
    public Item updateItemById(Item item, String itemId) {
        return itemService.updateItemById(item,itemId);
    }

    @Override
    public Item deleteItemById(String itemId) {
        return null;
    }
}
