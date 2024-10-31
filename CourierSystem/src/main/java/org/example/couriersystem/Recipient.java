package org.example.couriersystem;

public class Recipient {
    private long recipientId;
    private String name;
    private String phoneNum;
    private String email;

    Address address;

    public Recipient(long recipientId, String name, Address address, String phoneNum, String email) {
        this.recipientId = recipientId;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(long recipientId) {
        this.recipientId = recipientId;
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
        //lets recipient track their package
        Delivery status = new Delivery();
        status.updateStatus();

        System.out.println("Tracking package: " + status);
    }
}
