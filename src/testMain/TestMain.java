package testMain;

import animals.Cat;
import animals.Dog;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Gordon",10);
        System.out.println(cat);
        cat.greets();

        Dog dog =new Dog("Riko",5);
        System.out.println(dog);
        dog.greets();
        Dog dog2 =new Dog("Fafik",6);
        System.out.println(dog2);
        dog2.greets(dog);
    }
}
