public class Solution7_2 {
    public static void main(String[] args) {
        ShippingCompany company = new ShippingCompany();

        Shipment s1 = new StandardShipment("STD001", 10.0);
        Shipment s2 = new StandardShipment("STD002", 7.5);
        Shipment s3 = new ExpressShipment("EXP001", 4.0);
        Shipment s4 = new ExpressShipment("EXP002", 6.2);

        company.addShipment(s1);
        company.addShipment(s2);
        company.addShipment(s3);
        company.addShipment(s4);

        company.printAllCosts();
    }
}

abstract class Shipment {
    String trackingNumber;
    double weight;

    public Shipment(String trackingNumber, double weight) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
    }

    abstract double calculateCost();
}

class StandardShipment extends Shipment {
    public StandardShipment(String trackingNumber, double weight) {
        super(trackingNumber, weight);
    }

    double calculateCost() {
        return weight * 5;
    }
}

class ExpressShipment extends Shipment {
    public ExpressShipment(String trackingNumber, double weight) {
        super(trackingNumber, weight);
    }

    double calculateCost() {
        return weight * 10 + 20;
    }
}

class ShippingCompany {
    Shipment[] shipments = new Shipment[10];
    int count = 0;

    void addShipment(Shipment s) {
        if (count < shipments.length) {
            shipments[count++] = s;
        }
    }

    void printAllCosts() {
        for (int i = 0; i < count; i++) {
            System.out.println("Takip No: " + shipments[i].trackingNumber +
                    " - Agirlik: " + shipments[i].weight + " kg" +
                    " - Maliyet: " + shipments[i].calculateCost() + " TL");
        }
    }
}