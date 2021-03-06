package com.empsoft.safe_meal.models;

import java.util.Random;

/**
 * Created by samirsmedeiros on 12/03/17.
 */

public class ProfileItem {
    private int id;
    private String name;
    private Diet diet;

    public ProfileItem(String name, Diet diet) {
        this.name = name;
        this.diet = diet;
        final Random randomId = new Random();
        this.id = randomId.nextInt();
    }

    public ProfileItem(String name, Diet diet, int id) {
        this.name = name;
        this.diet = diet;
        this.id = id;
    }
    public Diet getDiet() {
        return diet;
    }

    public String getName() {
        return name;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId(){
        final Random randomId = new Random();
        this.id = randomId.nextInt();
    }
}
