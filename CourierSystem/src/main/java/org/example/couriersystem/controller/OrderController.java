package org.example.couriersystem.controller;

import org.example.couriersystem.Address;
import org.example.couriersystem.PackageInfo;
import org.example.couriersystem.Recipient;
import org.example.couriersystem.Retailer;
import org.example.couriersystem.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public String getOrderPage(Model model, Address address, Recipient recipient, Retailer retailer) {
        model.addAttribute(recipient);
        model.addAttribute(address);
        model.addAttribute(retailer);
        return "order";
    }

    @PostMapping("/order")
    public String order(@ModelAttribute PackageInfo packageInfo, Address address, Recipient recipient, Retailer retailer) {
        System.out.println("order request");

        PackageInfo orderPackage = orderService.createPackage(packageInfo.getWeight(), packageInfo.getHeight(), packageInfo.getLength(), packageInfo.getWidth());
        Address recipientAddress = orderService.RecipientAddress(address.getStreet(), address.getCity(), address.getProvince(), address.getPostalCode());
        Recipient orderRecipient = orderService.createRecipient(recipient.getRecipientId(),recipient.getName(), recipient.getPhoneNum(), recipient.getEmail(), recipient.getAddress());
        Address retailerAddress = orderService.RetailerAddress(address.getStreet(), address.getCity(), address.getProvince(), address.getPostalCode());
        Retailer orderRetailer = orderService.createRetailer(retailer.getRetailerId(), retailer.getName(), retailer.getPhoneNum(), retailer.getEmail(), retailer.getAddress());

        String createOrder = null; //initialized to avoid error

        return createOrder == null ? "order_error" : "/user_page";
    }
}
