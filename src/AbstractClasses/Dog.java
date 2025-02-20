package AbstractClasses;

public class Dog extends Animal {
    @Override
    public String getSound() {
        return "Mooo";
    }

    @Override
    public void getAge() {
        System.out.println("12");
    }

    @Override
    public void getType() {
        System.out.println("Domestic");
    }
}
