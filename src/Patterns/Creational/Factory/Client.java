package Patterns.Creational.Factory;

import Patterns.Creational.Factory.Concrete_Product.Course;

public class Client {
    public static void main(String[] args) {
        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");

        assert hldCourse != null;
        System.out.println("HLD Modules: ");
        System.out.println((hldCourse.modules));
        
        assert lldCourse != null;
        System.out.println("LLD Modules: ");
        System.out.println((lldCourse.modules));
    }

    /* Some other real world scenarios
     * 1) Notification System (Email, SMS, Push)
     * 2) Payment Gateway Integration etc
     */
}
