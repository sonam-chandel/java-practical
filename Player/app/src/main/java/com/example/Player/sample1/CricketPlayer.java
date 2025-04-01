/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Player.sample1;

import com.example.Player.sample.Player;

/**
 *
 * @author sonam
 */
public class CricketPlayer extends Player {
    private int total_Cricket_player;
 private int extra_Cricket_player;
 private String place_of_Cricket_player;

    public CricketPlayer(int total_Cricket_player, int extra_Cricket_player, String place_of_Cricket_player, String country_of_player, String type_of_player, String category_of_age, String experience, String name, int age, String dob, String education, String gender) {
        super(country_of_player, type_of_player, category_of_age, experience, name, age, dob, education, gender);
        this.total_Cricket_player = total_Cricket_player;
        this.extra_Cricket_player = extra_Cricket_player;
        this.place_of_Cricket_player = place_of_Cricket_player;
    }

    public int getTotal_Cricket_player() {
        return total_Cricket_player;
    }

    public void setTotal_Cricket_player(int total_Cricket_player) {
        this.total_Cricket_player = total_Cricket_player;
    }

    public int getExtra_Cricket_player() {
        return extra_Cricket_player;
    }

    public void setExtra_Cricket_player(int extra_Cricket_player) {
        this.extra_Cricket_player = extra_Cricket_player;
    }

    public String getPlace_of_Cricket_player() {
        return place_of_Cricket_player;
    }

    public void setPlace_of_Cricket_player(String place_of_Cricket_player) {
        this.place_of_Cricket_player = place_of_Cricket_player;
    }

    @Override
    public String toString() {
        return "CricketPlayer{" + "total_Cricket_player=" + total_Cricket_player + ", extra_Cricket_player=" + extra_Cricket_player + ", place_of_Cricket_player=" + place_of_Cricket_player + '}';
    }
   

}
