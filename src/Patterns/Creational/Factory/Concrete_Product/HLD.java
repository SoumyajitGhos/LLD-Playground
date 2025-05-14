package Patterns.Creational.Factory.Concrete_Product;

import Patterns.Creational.Factory.Product.ExerciseModule;
import Patterns.Creational.Factory.Product.IntroModule;
import Patterns.Creational.Factory.Product.SummaryModule;

public class HLD extends Course {
    
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new ExerciseModule());
        modules.add(new SummaryModule());
    }
}
