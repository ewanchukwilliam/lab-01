package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable {

    // Constructor with only name parameter
    public Cat(String name) {
        super(name);
    }

    // Constructor with both name and birthDate parameters
    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "meow"; // Cats meow
    }

    @Override
    public Void pet() {
        // Implementation for petting a cat
        return null;
    }
}
