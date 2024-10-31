package org.example.couriersystem;

public class Delivery {
    private long deliveryId;
    private String deliverDate;
    //private String status;

    public long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(String deliverDate) {
        this.deliverDate = deliverDate;
    }

    public Package updateStatus() {
        //change delivery status
        Package status = new Package();
        status.getStatus();

        //if package is on the way { status = "In Transit" }
            //else if package is delivered { status = "Delivered" }
            //else {status = "Pending" }

        System.out.println("Delivery status: " + status);

        return status;
    }
}
