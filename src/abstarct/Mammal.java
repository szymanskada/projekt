package abstarct;

public abstract class Mammal extends Animal {

    Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal{Animal{" +
                "name= " + name  +
                "}}";
    }
}
