package animals;

import abstarct.Mammal;

public class Cat extends Mammal {
    Cat(String name) {
        super(name);
    }
    void greets(){
        System.out.println("Meow ");
    }

    @Override
    public String toString() {
        return "Cat{Mammal{Animal{" +
                "name= " + name +
                "}}}";
    }
}
