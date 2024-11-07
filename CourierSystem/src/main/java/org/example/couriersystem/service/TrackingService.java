package org.example.couriersystem.service;

import org.example.couriersystem.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackingService {

    @Autowired
    private final DeliveryRepository deliveryRepository;

    public TrackingService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public boolean authenticateTracking(Long deliveryId) {
        boolean isTrackingMatch = deliveryRepository.findByDeliveryId(deliveryId);

        if (isTrackingMatch) {
            return true;
        } else {
            return false;
        }
    }
}
