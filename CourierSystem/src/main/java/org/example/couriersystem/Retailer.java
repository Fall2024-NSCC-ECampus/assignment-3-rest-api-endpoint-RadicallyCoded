package org.example.couriersystem;

public class Retailer {
    private long retailerId;
    private String name;
    private String phoneNum;
    private String email;

    Address address;

    public Retailer(long retailerId, String name, Address address, String phoneNum, String email) {
        this.retailerId = retailerId;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public long getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(long retailerId) {
        this.retailerId = retailerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void trackPackage() {
        Delivery status = new Delivery();
        status.updateStatus();

        System.out.println("Tracking package: " + status);
    }

    public void createOrder() {
        //lets retailer order delivery for package
        Package packageId = new Package();
        packageId.getPackageId();

        System.out.println("Order created for package #" + packageId);
    }

    public void makePayment() {
        //lets retailer pay for shipping
        Payment payment = new Payment();
        payment.processPayment();
    }

    public void getRefund() {
        Payment refund = new Payment();
        refund.refundPayment();
    }
}
