package testMain;

import animals.Cat;
import animals.Dog;
/**
 * @author szymanska
 * @version 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        /**
         * Wyprobowanie działania programu
         */
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
