package com.qxcjs.ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class School {
    private String name;

    private String address;

    private School() {
    }

    private School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
