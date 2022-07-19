package com.azizyelbay.advertisementservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertisementDto {

    private Long id;
    private String title;
    private BigDecimal price;
    private String description;
    private LocalDateTime createdAt;
    private String userName;
    private Boolean active;
    private Long visitCounter;
}
