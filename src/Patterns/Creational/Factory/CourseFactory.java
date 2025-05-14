package Patterns.Creational.Factory;

import Patterns.Creational.Factory.Concrete_Product.Course;
import Patterns.Creational.Factory.Concrete_Product.HLD;
import Patterns.Creational.Factory.Concrete_Product.LLD;

public class CourseFactory {
    public static Course getCourse(String courseType) {
        switch(courseType) {
            case "LLD":
                return new LLD();
            case "HLD":
                return new HLD();
            default:
                return null;
        }
    }
}
