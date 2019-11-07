package com.aqacourses.test;

/**
 * Class that extends abstract class
 */
public class StudentTwo extends AbstractStudent {

    /**
     * Constructor that matching constructor from ancestor class
     *
     * @param name
     * @param age
     * @param regNum
     */
    public StudentTwo(String name, int age, int regNum) {
        super(name, age, regNum);
    }

    /**
     * Override of abstract method from abstract class
     */
    @Override
    void printFromAbstractClass() {

    }
}
