package abstarct;

/**
 * @author szymanska
 * @version 1.0
 */

public abstract class Animal {
    protected String name;
    protected int howOld;
    /**
     * Informacje o zwierzeciu
     * @param name
     * @param howOld
     */
    protected Animal (String name, int howOld){
        this.name=name;
        this.howOld=howOld;
    }
    /**
     * Wypisanie informacji o zwierzeciu
     * @return name imie
     * @return howOld wiek
     *
     */

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name +
                "age= " + howOld +
                '}';
    }
}
