package com.azizyelbay.advertisementservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "advertisements")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private BigDecimal price;
    private String description;
    private LocalDateTime createdAt;
    private String userName;
    private Boolean active; // true is active advertisement, false is passive advertisement

    @Enumerated(EnumType.STRING)
    private Status status;
    private Long visitCounter;
}
