package com.furniro.InventoryService.database.repository;

import com.furniro.InventoryService.database.entity.StockReservation;
import com.furniro.InventoryService.utils.ReservationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ReservationRepository extends JpaRepository<StockReservation, Integer> {
    Optional<StockReservation> findBySku(String sku);

    List<StockReservation> findByOrderIDAndStatus(Integer orderId, ReservationStatus status);

    List<StockReservation> findAllByStatusAndExpiryTimeBefore(ReservationStatus status, LocalDateTime expiryTime);
}
