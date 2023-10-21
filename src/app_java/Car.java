package app_java;

import java.util.Scanner;

public class Car{
    enum TechnicalCondition {
        NEW, USED, NEEDS_REPAIR, OUT_OF_SERVICE
    }
    private String brand_model;
    private String country;
    private int year;
    private int price;
    private TechnicalCondition condition;
    private int quantity;

    // Конструктор без параметров
    public Car(){
        this.brand_model = "";
        this.country = "";
        this.year = 0;
        this.price = 0;
        this.condition = TechnicalCondition.valueOf("");
        this.quantity = 0;

    };

    //Конструтор с параметрами
    public Car(String brand_model, String country, int year, int price, TechnicalCondition condition, int quantity){
        this.brand_model = brand_model;
        this.country = country;
        this.year = year;
        this.price = price;
        this.condition = condition;
        this.quantity = quantity;

    }

    // Метод для ввода информации об авто
    public void inputCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите марку и модель авто: ");
        setBrand_model(scanner.nextLine());

        System.out.print("Введите страну-производитель: ");
        setCountry(scanner.nextLine());

        System.out.print("Введите год производства: ");
        setYear(scanner.nextInt());

        System.out.print("Введите цену: ");
        setPrice(scanner.nextInt());

        do {
            System.out.print("Введите состояние (NEW, USED, NEEDS_REPAIR, OUT_OF_SERVICE): ");
            String input = scanner.next();

            try {
                setCondition(TechnicalCondition.valueOf(input));
            } catch (IllegalArgumentException e) {
                System.out.println("Недопустимое состояние автомобиля. Попробуйте снова.");
            }
        } while (condition == null);

        System.out.print("Введите количество: ");
        setQuantity(scanner.nextInt());

    }

    // Метод для вывода информации об авто
    public void outCar() {
        System.out.println("Марка и модель авто:" + getBrand_model());
        System.out.println("Страна-производитель: " + getCountry());
        System.out.println("Год производства: " + getYear());
        System.out.println("Цена: " + getPrice());
        System.out.println("Техническое состояние: " + getCondition());
        System.out.println("Количество: " + getQuantity());
    }

    public String getBrand_model() {
        return brand_model;
    }

    public void setBrand_model(String brand_model) {
        this.brand_model = brand_model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TechnicalCondition getCondition() {
        return condition;
    }

    public void setCondition(TechnicalCondition condition) {
        this.condition = condition;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
