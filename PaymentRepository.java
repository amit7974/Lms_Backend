package com.coder_amit.repositories;

import com.coder_amit.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByCentre_Id(Long centreId);
}