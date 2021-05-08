package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Animal barnie = new Animal("husky", 3, "Barnie", 30.0, "pies");
        Animal viper = new Animal("snake", 2, "Viper", 10.0, "kot");

        Car car1 = new Car("Prelude", CarManufacturers.HONDA, "Blue", 3, 2000.00);
        Car car2 = new Car("E class", CarManufacturers.MB, "White", 5, 70000.00);

        Human worker = new Human("Jan", "Kowalski", "Manager", 22, true, barnie, car1, 3500.00);
        Human worker1 = new Human("Pawel", "Kowalczyk", "Cleaner", 35, false, viper, car2, 2000.00);
        Human worker2 = new Human("Pawel", "Kowalczyk", "Cleaner", 35, false, viper, car2, 2000.00);
        Human worker3 = new Human("Pawel", "Kowalczyk", "Cleaner", 35, false, viper, car2, 2000.00);

        Phone myPhone = new Phone("Samsung", false, "Android");
        Phone friendsPhone = new Phone("Iphone", true, "iOS");



        System.out.println(barnie);
        System.out.println(worker.firstName);

        if(barnie.getWeight() > viper.getWeight()) System.out.println("Zwierzak o imieniu: " + barnie.name + " jest cięższy i waży: " + barnie.getWeight());
        else System.out.println("Zwierzak o imieniu: " + viper.name + " jest cięższy i waży: " + viper.getWeight());

        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(worker);
        humansList.add(worker1);

        for (Human human : humansList){
            System.out.println(human.lastName);
        }
        System.out.println(barnie.getWeight());

        for(int i=0;i<=30;i++) {
            barnie.takeForAWalk();
        }

        for(int i=0;i<=10;i++) {
            viper.takeForAWalk();
        }

        System.out.println(worker.getCar().getModel());
        System.out.println(worker1.getCar().getDoors());

        System.out.println("Wynik porównania: " + worker2.equals(worker3));
        System.out.println(worker);
        System.out.println(viper);
        System.out.println(car1);
        System.out.println(myPhone);

        worker.setSalary(-5.);
        System.out.println("Wypłata: " + worker.getSalary());
        worker.setSalary(5000.);

        worker.setCar(car1);
        worker.setCar(car2);
    }
}
