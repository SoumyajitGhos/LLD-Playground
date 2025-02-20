package AbstractClasses;

/**
 * 1) I want a base class upon which I will make different entity/subclass
 * which are broadly categories into a generic name called Animal.
 * But I don't want to instantiate this class since there is no clear
 * context what type of object of the class is.
 * Like what type of Animal is this no specification related to this.
 * 2) I want to make the system Loosely coupled I want to know the sound of
 * an animal which can be Lion or cat whatever it is it should give me the noise.
 */

public abstract class Animal {
    int name;
    int age;
    int type;

    /**
     * I know that every animal will make some kind of noise,
     * so I deliberately want the subclass to implement this function
     * makeNoise that is why I will make this function an abstract one.
     */
    public abstract String getSound();
    public abstract void getAge();
    public abstract void getType();

    /**
     * I know that every animal will not have name, so I didn't force the
     * subsequent subclass to implement this function by not mentioning abstract keyword
     */
    public void getName() {
        System.out.println("Name of the animal is " + this.name);
    }
}
