package com.project.itemservice.controller;

import com.project.itemservice.model.Item;
import com.project.itemservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@CrossOrigin(origins = "*")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public Page<Item> getItems(
            @RequestParam(defaultValue = "") String search,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction
    ) {
        Sort sort = direction.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(page, size, sort);

        if (search.isBlank()) {
            return itemRepository.findAll(pageable);
        }
        return itemRepository.findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(
                search, search, pageable
        );
    }


    @PostMapping("/add")
    public List<Item> addItems(@RequestBody List<Item> items) {
        return itemRepository.saveAll(items);
    }
}
