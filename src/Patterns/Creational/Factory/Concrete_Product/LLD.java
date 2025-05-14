package Patterns.Creational.Factory.Concrete_Product;

import Patterns.Creational.Factory.Product.DemoModule;
import Patterns.Creational.Factory.Product.IntroModule;
import Patterns.Creational.Factory.Product.SummaryModule;

public class LLD extends Course {
    
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new DemoModule());
        modules.add(new SummaryModule());
    }
}
