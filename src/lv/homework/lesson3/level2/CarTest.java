package lv.homework.lesson3.level2;

//Ok
//lietojam "ctrl + alt + l"
public class CarTest {
    public static void main(String[] args) {
        Car NewCar = new Car();
        NewCar.setColor("White");
        NewCar.setManufacturer("Mazda");
        NewCar.setYear(2020);

        System.out.println(NewCar.getManufacturer() + "\n" + NewCar.getColor() + "\n" + NewCar.getYear());
    }
}
