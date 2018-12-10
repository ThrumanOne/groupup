package com.thruman.java.common.util.poiUtil;

/**
 * 类说明
 * <p>
 *
 * @author niexiang
 * @version 1.0.0
 * @date 2018/12/10
 */
public class Person {

    private String name;

    private Integer age;

    private String gender;

    public Person() {
    }

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
