package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable {

    // Constructor with only name parameter
    public Dog(String name) {
        super(name);
    }

    // Constructor with both name and birthDate parameters
    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "bark";
    }

    @Override
    public Void pet() {
        // Implementation for petting a dog
        return null;
    }
}
