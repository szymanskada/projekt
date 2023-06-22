package animals;

import abstarct.Mammal;

public class Cat extends Mammal {
    public Cat(String name, int howOld) {
        super(name,howOld);
    }
    public void greets(){
        System.out.println("Meow ");
    }

    @Override
    public String toString() {
        return "Cat (Mammal): " +
                "name = " + name +
                "age= " + howOld +
                ".";
    }
}
