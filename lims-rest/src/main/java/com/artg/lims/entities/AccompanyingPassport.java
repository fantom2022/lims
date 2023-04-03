package com.artg.lims.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccompanyingPassport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accompanyingPassportNumber;
    private Long productAmount;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
