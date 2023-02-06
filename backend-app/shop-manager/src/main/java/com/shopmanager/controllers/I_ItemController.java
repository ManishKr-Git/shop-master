package com.shopmanager.controllers;

import com.shopmanager.entities.Item;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
public interface I_ItemController {

    @PostMapping()
    Item addNewItem(@RequestBody Item item);

    @GetMapping("")
    List<Item> getAllItems();

    @GetMapping("/{itemId}")
    Item getItemById(@PathVariable String itemId);

    @PutMapping("/{itemId}")
    Item updateItemById(@RequestBody Item item, @PathVariable String itemId);

    @DeleteMapping("/{itemId}")
    Item deleteItemById(@PathVariable String itemId);

}
