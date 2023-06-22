package abstarct;
public abstract class Animal {
    protected String name;
    protected int howOld;

    protected Animal (String name, int howOld){
        this.name=name;
        this.howOld=howOld;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name +
                "age= " + howOld +
                '}';
    }
}
