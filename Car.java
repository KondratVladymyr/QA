public class Car {
    String color;
    String brand;
    public  Car setBrand(String b) {
        this.brand = b;
        return this;
    }
    public Car setColor(String c) {
        this.color = c;
        return this;
    }
    public void showCar() {
        System.out.println("Цвет: " + color + " Бренд: " + brand);
    }
    public static void main(String[] args){
            Car Chery = new Car();
            Chery.setBrand("Chery").setColor("Синий").showCar();
            new Car().setColor("Зелёный").setBrand("KIA").showCar();
    }
}