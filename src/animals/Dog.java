package animals;

import abstarct.Mammal;
public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Woof ");
    }
    public void greets(Dog another){
        System.out.println("Wooof Wooooof ");
    }

    @Override
    public String toString() {
        return "Dog (Mammal): " +
                "name = " + name +
                ".";
    }
}
