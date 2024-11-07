package org.example.couriersystem.service;

import org.example.couriersystem.Payment;
import org.example.couriersystem.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment getPayment(String paymentDate, String status, String method) {
        Payment payment = new Payment();

        System.out.println("Shipping cost is: $" + payment.getAmount());

        //statement for getting the payment method and processing payment
        payment.setMethod(method);
        payment.setPaymentDate(paymentDate);
        payment.setStatus(status);

        return paymentRepository.save(payment);
    }

    public Payment returnPayment(String paymentDate, String status, String method) {
        Payment payment = new Payment();

        System.out.println("Amount paid was: $" + payment.getAmount());

        //statement for getting the payment method and processing return
        payment.setMethod(method);
        payment.setPaymentDate(paymentDate);
        payment.setStatus(status);

        return paymentRepository.save(payment);
    }
}
