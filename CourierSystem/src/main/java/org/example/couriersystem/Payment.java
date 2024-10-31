package org.example.couriersystem;

public class Payment {
    private long paymentId;
    private String paymentDate;
    private String status = "Pending";
    private String method; //"Credit" or "e-Transfer" or "PayPal"



    public Package getAmount() {
        Package amount = new Package();
        amount.calculateShippingCost();

        return amount;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void processPayment() {
        status = "Paid";
        Package amount = getAmount();

        System.out.println("Payment of $" + amount + " paid in full via " + method + ".");
    }

    public void refundPayment() {
        status = "Refunded";
        Package amount = getAmount();

        System.out.println("Payment of $" + amount + " refunded.");
    }

}
