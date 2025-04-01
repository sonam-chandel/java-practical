/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Player.sample;

import com.example.Player.Human;

/**
 *
 * @author sonam
 */
public class Player extends Human {
     private String country_of_player;
    private String type_of_player;
    private String category_of_age;
    private String experience;

    public Player(String country_of_player, String type_of_player, String category_of_age, String experience, String name, int age, String dob, String education, String gender) {
        super(name, age, dob, education, gender);
        this.country_of_player = country_of_player;
        this.type_of_player = type_of_player;
        this.category_of_age = category_of_age;
        this.experience = experience;
    }

    public String getCountry_of_player() {
        return country_of_player;
    }

    public void setCountry_of_player(String country_of_player) {
        this.country_of_player = country_of_player;
    }

    public String getType_of_player() {
        return type_of_player;
    }

    public void setType_of_player(String type_of_player) {
        this.type_of_player = type_of_player;
    }

    public String getCategory_of_age() {
        return category_of_age;
    }

    public void setCategory_of_age(String category_of_age) {
        this.category_of_age = category_of_age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Player{" + "country_of_player=" + country_of_player + ", type_of_player=" + type_of_player + ", category_of_age=" + category_of_age + ", experience=" + experience + '}';
    }
   

    
}
