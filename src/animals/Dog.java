package animals;

import abstarct.Mammal;
public class Dog extends Mammal {
    /**
     * Nadanje imie pieskowi
     * @param name imie
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
     * @return imie psa
     */
    @Override
    public String toString() {
        return "Dog (Mammal): " +
                "name = " + name +
                "age= " + howOld +
                ".";
    }
}
