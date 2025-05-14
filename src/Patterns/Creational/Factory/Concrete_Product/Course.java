package Patterns.Creational.Factory.Concrete_Product;

import java.util.List;
import java.util.ArrayList;
import Patterns.Creational.Factory.Product.Module;

public abstract class Course {
    public List<Module> modules = new ArrayList<>();

    public Course() {
        this.createCourse();
    }

    public List<Module> getModules() {
        return modules;
    }

    public abstract void createCourse();
}
