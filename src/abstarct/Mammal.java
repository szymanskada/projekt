package abstarct;

public abstract class Mammal extends Animal {

    protected Mammal(String name, int howOld) {
        super(name,howOld);

    }

    @Override
    public String toString() {
        return "Mammal{Animal{" +
                "name= " + name  +
                "age= " + howOld +
                "}}";
    }
}
