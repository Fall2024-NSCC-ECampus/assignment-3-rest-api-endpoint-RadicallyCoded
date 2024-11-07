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
        PackageInfo packageInfoId = new PackageInfo();
        packageInfoId.getPackageId();

        System.out.println("Assigned package #" + packageInfoId + " to courier: " + name);
    }
}
