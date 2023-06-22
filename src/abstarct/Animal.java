package abstarct;
public abstract class Animal {
    protected String name;

    protected Animal (String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
