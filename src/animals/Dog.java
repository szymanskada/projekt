package animals;

import abstarct.Mammal;
/**
 * @author szymanska
 * @version 1.0
 */
public class Dog extends Mammal {
    /**
     * Nadanje imienia i wieku pieskowi
     * @param name imie
     * @param howOld wiek
     */
    public Dog(String name, int howOld) {
        super(name,howOld);
    }

    /**
     * Witajace szczekanie psa
     */
    public void greets(){
        System.out.println("Woof ");
    }

    /**
     * Szczekanie na drugiego psa
     * @param another pies na którego drugi szczeka
     */
    public void greets(Dog another){
        System.out.println("Wooof Wooooof ");
    }

    /**
     * Wypisanie informacji o psie
     * @return name imie psa
     * @return howOld wiek psa
     *
     */
    @Override
    public String toString() {
        return "Dog (Mammal): " +
                "name = " + name +
                "age= " + howOld +
                ".";
    }
}
