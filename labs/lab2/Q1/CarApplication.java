import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        Scanner input = new Scanner(System.in);

        String model1;
        String year1;
        double price1;
        System.out.print("İlk aracın modelini girin: ");
        model1 = input.nextLine();
        System.out.print("İlk aracın üretim yılını girin: ");
        year1 = input.nextLine();
        System.out.print("İlk aracın fiyatını girin: ");
        price1 = Double.parseDouble(input.nextLine());

        String model2;
        String year2;
        double price2;
        System.out.print("İkinci aracın modelini girin: ");
        model2 = input.nextLine();
        System.out.print("İkinci aracın üretim yılını girin: ");
        year2 = input.nextLine();
        System.out.print("İkinci aracın fiyatını girin: ");
        price2 = Double.parseDouble(input.nextLine());

        System.out.println("Başlangıç fiyatı - Car 1 (" + model1 + "): $" + price1);
        System.out.println("Başlangıç fiyatı - Car 2 (" + model2 + "): $" + price2);

        double discPrice1 = price1 - (price1 * (0.05));
        double discPrice2 = price2 - (price2 * (0.07));

        car1.setModel(model1);
        car1.setYear(year1);
        car1.setPrice(discPrice1);

        car2.setModel(model2);
        car2.setYear(year2);
        car2.setPrice(discPrice2);

        System.out.println("İndirimli fiyatı - Car 1 (" + model1 + "): $" + discPrice1);
        System.out.println("İndirimli fiyatı - Car 2 (" + model2 + "): $" + discPrice2);

    }
}

class Car {

    private String model;
    private String year;
    private double price;

    public Car() {}

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            return;
        }
        this.price = price;
    }

}