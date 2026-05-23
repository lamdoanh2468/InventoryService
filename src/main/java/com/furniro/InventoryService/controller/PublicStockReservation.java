package com.furniro.InventoryService.controller;

import com.furniro.InventoryService.dto.API.AType;
import com.furniro.InventoryService.service.StatisticService;
import com.furniro.InventoryService.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@Tag(name = "Public Stock", description = "API kho hàng cho khách hàng")
@RequestMapping("/public/stock")
@RequiredArgsConstructor
public class PublicStockReservation {
    private final StatisticService statisticService;
    private final StockService stockService;

    @GetMapping("/available/{sku}")
    public ResponseEntity<AType> getAvailableStock(@PathVariable String sku) {
        return statisticService.getAvailableStock(sku);
    }

    @GetMapping("/details/{sku}")
    public ResponseEntity<AType> getStockDetails(@PathVariable String sku) {
        return stockService.getStockBySku(sku);
    }
}