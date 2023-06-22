package abstarct;

public abstract class Mammal extends Animal {
    /**
     * Informacje o ssaku
     * @param name
     * @param howOld
     */
    protected Mammal(String name, int howOld) {
        super(name,howOld);

    }
    /**
     * Wypisanie informacji o ssaku
     * @return name imie
     * @return howOld wiek
     *
     */

    @Override
    public String toString() {
        return "Mammal{Animal{" +
                "name= " + name  +
                "age= " + howOld +
                "}}";
    }
}
