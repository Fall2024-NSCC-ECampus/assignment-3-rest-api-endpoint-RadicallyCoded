package org.example.couriersystem;

public class Delivery {
    private long deliveryId;
    private String deliveryDate;
    //private String status;

    public long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public PackageInfo updateStatus() {
        //change delivery status
        PackageInfo status = new PackageInfo();
        status.getStatus();

        //if package is on the way { status = "In Transit" }
            //else if package is delivered { status = "Delivered" }
            //else {status = "Pending" }

        System.out.println("Delivery status: " + status);

        return status;
    }
}
