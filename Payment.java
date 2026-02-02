package com.coder_amit.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private LocalDate paymentDate;

    @ManyToOne
    @JoinColumn(name = "centre_id")
    private Centre centre;
}
