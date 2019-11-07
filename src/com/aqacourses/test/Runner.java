package com.aqacourses.test;

import static com.aqacourses.test.DaysOfWeek.TUESDAY;

public class Runner {

    public static void main(String[] args) {

        // Create object of class student
        Student studentAnn = new Student("Ann", 38, 100);

        // Create object of class student second time
        Student studentEmily = new Student("Emily", 19, 200);

        // Call static method
        Student.staticMethod();

        // Get some data from enum without import
        System.out.println(DaysOfWeek.MONDAY.getValue());

        // Get data from enum using static import
        System.out.println(TUESDAY.getValue());

        // Create instance of inner class
        ClassWithInnerClass.InnerStaticClass innerStaticClass = new ClassWithInnerClass.InnerStaticClass();

        // Using method from inner class
        innerStaticClass.methodFromInnerClass();

        // Print static string from class
        System.out.println(Student.staticString);




    }

}
