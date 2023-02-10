package Homework6;

public class Laptop {
    public String manufacturer;
    public Integer ram;
    public Integer hardDrives;
    public Double screenDiagonal;
    public String color;
    public Integer productCode;

    public Integer price;

    public Laptop(String manufacturer, Integer ram, Integer hardDrives, Double screenDiagonal, String color, Integer productCode,Integer price) {
        this.manufacturer=manufacturer;
        this.ram=ram;
        this.hardDrives=hardDrives;
        this.screenDiagonal=screenDiagonal;
        this.color=color;
        this.productCode=productCode;
        this.price = price;

    }

    public void printInfo() {
        System.out.printf ("Производитель :%s\n Объем оперативной памяти :%d\n  Объем жесткого диска :%d\n" +
                "Диагональ экрана :%.1f\n Цвет :%s\n Код продукта :%s\n", manufacturer, ram, hardDrives, screenDiagonal, color, productCode);
        System.out.println ();
    }

    public String getColor() {
        return color;
    }
}



