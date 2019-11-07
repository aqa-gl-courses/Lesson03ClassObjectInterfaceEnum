package com.aqacourses.test;

public abstract class AbstractStudent {

    // Some private class variables
    private String name;
    private int age;
    private int regNum;

    /**
     * Constructor
     * All classes that inherited that abstract class must create the same constructor
     *
     * @param name
     * @param age
     * @param regNum
     */
    public AbstractStudent(String name, int age, int regNum) {
        System.out.println("This is name from abstract class - " + name);
        System.out.println("This is age from abstract class - " + age);
        System.out.println("This is regNum from abstract class  - " + regNum);
    }

    /**
     * Abstract method that must be implemented in all child classes
     */
    abstract void printFromAbstractClass();

    /**
     * Not abstract method. It can be used by child classes
     *
     * @param name
     */
    public void printName(String name) {
        System.out.println(name);
    }

    /**
     * Not abstract method. It can be used by child classes
     *
     * @param age
     */
    public void printAge(int age) {
        System.out.println(age);
    }

    /**
     * Not abstract method. It can be used by child classes
     *
     * @param regNum
     */
    public void printRegNum(int regNum) {
        System.out.println(regNum);
    }

    /**
     * Final method. It means that you can use it
     * but cannot override
     */
    public final void finalMethod() {

    }

    /**
     * Just another not abstract that
     * can be used by child classes
     */
    public void anotherMethod() {

    }

}
