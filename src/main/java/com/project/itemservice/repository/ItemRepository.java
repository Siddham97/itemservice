package com.project.itemservice.repository;

import com.project.itemservice.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Page<Item> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String name, String desc, Pageable pageable);
}
