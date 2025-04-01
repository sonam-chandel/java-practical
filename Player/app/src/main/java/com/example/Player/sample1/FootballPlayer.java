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
public class FootballPlayer extends Player {
    private int total_Football_player;
     private int extra_Football_player;
      private String place_of_Football_player;

    public FootballPlayer(int total_Football_player, int extra_Football_player, String place_of_Football_player, String country_of_player, String type_of_player, String category_of_age, String experience, String name, int age, String dob, String education, String gender) {
        super(country_of_player, type_of_player, category_of_age, experience, name, age, dob, education, gender);
        this.total_Football_player = total_Football_player;
        this.extra_Football_player = extra_Football_player;
        this.place_of_Football_player = place_of_Football_player;
    }

    public int getTotal_Football_player() {
        return total_Football_player;
    }

    public void setTotal_Football_player(int total_Football_player) {
        this.total_Football_player = total_Football_player;
    }

    public int getExtra_Football_player() {
        return extra_Football_player;
    }

    public void setExtra_Football_player(int extra_Football_player) {
        this.extra_Football_player = extra_Football_player;
    }

    public String getPlace_of_Football_player() {
        return place_of_Football_player;
    }

    public void setPlace_of_Football_player(String place_of_Football_player) {
        this.place_of_Football_player = place_of_Football_player;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" + "total_Football_player=" + total_Football_player + ", extra_Football_player=" + extra_Football_player + ", place_of_Football_player=" + place_of_Football_player + '}';
    }
      
    }


