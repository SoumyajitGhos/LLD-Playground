package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        /**
         * If I have a class whose actions are dependent on input parameter
         * and if we statically pass a class object will make then tightly coupled
         * when Lion class will be passed the code will break.
         * So we used an abstract class to pass and provider the type based on our
         * requirement which would implements the Base class
         */
        Animal d = new Dog();
        RecordSound record = new RecordSound(d);
        record.storeSound();
    }
}