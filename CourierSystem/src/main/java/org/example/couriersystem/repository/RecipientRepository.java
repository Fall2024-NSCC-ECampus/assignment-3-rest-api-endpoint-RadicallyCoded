package org.example.couriersystem.repository;

import org.example.couriersystem.Payment;
import org.example.couriersystem.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientRepository extends JpaRepository<Recipient, Long> {
}
