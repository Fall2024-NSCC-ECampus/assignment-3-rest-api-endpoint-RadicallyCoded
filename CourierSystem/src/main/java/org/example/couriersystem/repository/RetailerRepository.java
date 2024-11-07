package org.example.couriersystem.repository;

import org.example.couriersystem.Payment;
import org.example.couriersystem.Retailer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetailerRepository extends JpaRepository<Retailer, Long> {
}
