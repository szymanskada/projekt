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
        Dog dog2 =new Dog("Fafik");
        System.out.println(dog2);
        dog2.greets(dog);
    }
}
