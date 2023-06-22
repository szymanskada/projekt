package testMain;

import animals.Cat;
import animals.Dog;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Gordon");
        System.out.println(cat);
        cat.greets();

        Dog dog =new Dog("Riko");
        System.out.println(dog);
        dog.greets();
        dog.greets(dog);

    }
}
