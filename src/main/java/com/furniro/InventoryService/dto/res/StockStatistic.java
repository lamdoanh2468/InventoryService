package com.furniro.InventoryService.dto.res;

import com.furniro.InventoryService.database.entity.Stock;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockStatistic {  private Integer totalAvailableStock;

    private Integer totalReservedStock;

    private Integer totalStock;

    private List<Stock> lowStock;

}
