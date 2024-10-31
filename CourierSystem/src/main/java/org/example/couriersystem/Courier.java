package org.example.couriersystem;

public class Courier {
    private long courierId;
    private String name;
    private String plateNum;

    public long getCourierId() {
        return courierId;
    }

    public void setCourierId(long courierId) {
        this.courierId = courierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public void assignPackage() {
        Package packageId = new Package();
        packageId.getPackageId();

        System.out.println("Assigned package #" + packageId + " to courier: " + name);
    }
}
