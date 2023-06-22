package abstarct;
public abstract class Animal {
    String name;

    Animal (String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
