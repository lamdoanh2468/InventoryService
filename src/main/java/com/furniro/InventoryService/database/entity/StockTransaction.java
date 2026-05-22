package com.furniro.InventoryService.database.entity;

import com.furniro.InventoryService.utils.TransactionType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "StockTransaction")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StockTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionID;

    private String sku;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private TransactionType type = TransactionType.IN;

    private Integer quantity;

    private String referenceID;

    @Column(columnDefinition = "TEXT")
    private String note;

    @CreationTimestamp
    private LocalDateTime createdAt;
}


