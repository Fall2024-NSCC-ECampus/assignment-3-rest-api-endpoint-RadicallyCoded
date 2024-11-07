package org.example.couriersystem.controller;

import org.example.couriersystem.Delivery;
import org.example.couriersystem.service.TrackingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrackingController {

    private final TrackingService trackingService;

    public TrackingController(TrackingService trackingService) {
        this.trackingService = trackingService;
    }

    @GetMapping("/tracking")
    public String getTrackingPage(Model model) {
        model.addAttribute("trackingRequest", new Delivery());
        return "tracking";
    }

    @PostMapping("/tracking")
    public String tracking(@ModelAttribute Delivery delivery, Model model) {
        System.out.println("tracking request: " + delivery);
        boolean authenticateTracking = trackingService.authenticateTracking(delivery.getDeliveryId());
        if (authenticateTracking) {
            model.addAttribute("trackingPackage", delivery.getDeliveryId());
            return "/package_page";
        } else {
            return "tracking_error";
        }
    }

}
