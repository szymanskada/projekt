package animals;

import abstarct.Mammal;

public class Cat extends Mammal {
    /**
     * Nadanje imienia i wieku kotkowi
     * @param name imie
     * @param howOld wiek
     */
    public Cat(String name, int howOld) {
        super(name,howOld);
    }

    /**
     * Przywitanie kotka
     */
    public void greets(){
        System.out.println("Meow ");
    }
    /**
     * Wypisanie informacji o kocie
     * @return name imie kota
     * @return howOld wiek kota
     *
     */

    @Override
    public String toString() {
        return "Cat (Mammal): " +
                "name = " + name +
                "age= " + howOld +
                ".";
    }
}
