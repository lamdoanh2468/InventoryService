package com.furniro.InventoryService.database.repository;

import com.furniro.InventoryService.database.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
    public Optional<Warehouse> findById(Integer id);
}
