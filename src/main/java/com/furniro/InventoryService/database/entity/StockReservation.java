package com.furniro.InventoryService.database.entity;

import com.furniro.InventoryService.utils.ReservationStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Entity
@Table(name = "StockReservation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StockReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationID;

    private String sku;

    private Integer orderID;

    private Integer quantity;

    private Integer variantID;

    private LocalDateTime expiryTime;


    @Enumerated(EnumType.STRING)
    @Builder.Default
    private ReservationStatus status = ReservationStatus.PENDING;
}
