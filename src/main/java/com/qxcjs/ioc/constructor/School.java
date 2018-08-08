package com.qxcjs.ioc.constructor;

import org.springframework.beans.factory.FactoryBean;

public class School implements FactoryBean<School> {
    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public School getObject() throws Exception {
        School school = new School();
        school.setAddress("FactoryBean address");
        school.setName("FactoryBean name");
        return school;
    }

    @Override
    public Class<?> getObjectType() {
        return School.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
