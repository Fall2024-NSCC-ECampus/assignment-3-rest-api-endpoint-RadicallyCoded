package org.example.couriersystem;

public class Package {
    private long packageId;
    private double weight;
    private double height;
    private double length;
    private double width;
    private String status = "Pending";

    public long getPackageId() {
        return packageId;
    }

    public void setPackageId(long packageId) {
        this.packageId = packageId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void calculateShippingCost() {
        //uses dimensions and weight to calculate cost of shipping
        double shipping = 0;

        //math

        System.out.println("Cost of shipping: $" + shipping);

    }

}
