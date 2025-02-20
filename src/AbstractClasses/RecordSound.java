package AbstractClasses;

public class RecordSound {
    Animal a;
    public RecordSound(Animal a) {
        this.a = a;
    }

    public void storeSound() {
        System.out.print("Sound "+ this.a.getSound() + " has been recorded");
    }
}
