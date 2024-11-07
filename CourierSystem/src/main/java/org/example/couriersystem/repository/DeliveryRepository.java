package org.example.couriersystem.repository;

import org.example.couriersystem.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

    boolean findByDeliveryId(Long deliveryId);
}
