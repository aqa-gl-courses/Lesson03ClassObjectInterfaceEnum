package com.aqacourses.test;

/**
 * Enum. It's just list of some values
 */
public enum DaysOfWeek {

    // This are values
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String value;

    /**
     * Constructor
     *
     * @param name
     */
    DaysOfWeek(String name) {
        this.value = name;
    }

    /**
     * Getter of day
     *
     * @return string with day
     */
    public String getValue() {
        return value;
    }
}