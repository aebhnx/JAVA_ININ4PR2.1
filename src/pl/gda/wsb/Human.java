package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Human {

    SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Date date = new Date(System.currentTimeMillis());
    String firstName;
    String lastName;
    String position;
    int age;
    boolean isWorking;
    Animal pet;
    private Car car;
    private Double salary;

    public Human(String firstName, String lastName, String position, int age, boolean isWorking, Animal pet, Car car, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.isWorking = isWorking;
        this.pet = pet;
        this.car = car;
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(salary>car.getWorth()){
            System.out.println("Super, kupiłeś auto za gotówkę" + car.toString());
            this.car = car;
        }
        else if (this.salary > 0.83 * car.getWorth()){
            System.out.println("Kupiłeś auto, ale na raty");
            this.car = car;
        }
        else System.out.println("Sorry, musisz zwiększyć swoją wypłatę!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return age == human.age && isWorking == human.isWorking && Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(position, human.position) && Objects.equals(pet, human.pet) && Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position, age, isWorking, pet, car);
    }

    public Double getSalary() {
        System.out.println(date + " Pobrano dane o wypłacie usera " + this.lastName);
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary>0){
        this.salary = salary;
        System.out.println("Nowe dane zostały wysłane do systemu księgowego!");
        System.out.println("Czeka na Ciebie nowy aneks do podpisania!");
        System.out.println("Nowe dane zostały wysłane i dostarczone do ZUS i US!");
        }
        else System.out.println("Wypłata nie może być ujemna!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", isWorking=" + isWorking +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
