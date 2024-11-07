package org.example.couriersystem.controller;

import org.example.couriersystem.Payment;
import org.example.couriersystem.service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/payment")
    public String getPaymentPage(Model model) {
        String paymentRequest = null; //initialized in place of html
        model.addAttribute(paymentRequest, new Payment());
        return "payment";
    }

    @PostMapping("/payment")
    public String payment(@ModelAttribute Payment payment) {
        System.out.println("payment request: " + payment);
        Payment getPayment = paymentService.getPayment(payment.getPaymentDate(), payment.getStatus(), payment.getMethod());
        return getPayment == null ? "payment_error" : "/user_page";
    }

    @GetMapping("/refund")
    public String getRefundPage(Model model) {
        String refundRequest = null; //initialized in place of html
        model.addAttribute(refundRequest, new Payment());
        return "refund";
    }

    @PostMapping("/refund")
    public String refund(@ModelAttribute Payment payment) {
        System.out.println("refund request: " + payment);
        Payment returnPayment = paymentService.returnPayment(payment.getPaymentDate(), payment.getStatus(), payment.getMethod());
        return returnPayment == null ? "refund_error" : "/user_page";
    }
}
