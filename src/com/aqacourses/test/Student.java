package com.aqacourses.test;

/**
 * This is public class that extends abstract student and implements interface
 */
public class Student extends AbstractStudent implements InterfacePrint {

    // Some class variables
    private String name;
    private int age;
    private int regNum;

    // Static string with default access level
    static String staticString;

    /**
     * Constructor that matching super constructor in class ancestor
     *
     * @param name
     * @param age
     * @param regNum
     */
    public Student(String name, int age, int regNum) {
        super(name, age, regNum);
        this.name = name;
        this.age = age;
        this.regNum = regNum;
        System.out.println("This is name - " + name);
        System.out.println("This is age - " + age);
        System.out.println("This is regNum - " + regNum);
    }

    /**
     * Method from abstract class that we must override
     */
    @Override
    void printFromAbstractClass() {

    }

    /**
     * Method from interface that we must override
     *
     * @param name
     */
    @Override
    public void printNameFromInterface(String name) {

    }

    /**
     * Method from interface that we must override
     *
     * @param age
     */
    @Override
    public void printAgeFromInterface(int age) {

    }

    /**
     * Method that we override from abstract class
     * but it's not necessary it's only by our will
     */
    @Override
    public void anotherMethod() {

    }

    /**
     * Static method
     */
    public static void staticMethod() {

    }

}
