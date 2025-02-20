package AbstractClasses;

public class Lion extends Animal {
    @Override
    public String getSound() {
        return "Grunt";
    }

    @Override
    public void getAge() {
        System.out.println("18");
    }

    @Override
    public void getType() {
        System.out.println("Wild");
    }
}
