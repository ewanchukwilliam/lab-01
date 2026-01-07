package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet {

    // Constructor with only name parameter
    public Scorpion(String name) {
        super(name);
    }

    // Constructor with both name and birthDate parameters
    public Scorpion(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "hiss";
    }
}
