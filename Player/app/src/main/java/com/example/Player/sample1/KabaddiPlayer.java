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
public class KabaddiPlayer extends Player {
     private int total_Kabaddi_player;
     private int extra_kabaddi_player;
      private String place_of_Kabaddi_player;

    public KabaddiPlayer(int total_Kabaddi_player, int extra_kabaddi_player, String place_of_Kabaddi_player, String country_of_player, String type_of_player, String category_of_age, String experience, String name, int age, String dob, String education, String gender) {
        super(country_of_player, type_of_player, category_of_age, experience, name, age, dob, education, gender);
        this.total_Kabaddi_player = total_Kabaddi_player;
        this.extra_kabaddi_player = extra_kabaddi_player;
        this.place_of_Kabaddi_player = place_of_Kabaddi_player;
    }

    public int getTotal_Kabaddi_player() {
        return total_Kabaddi_player;
    }

    public void setTotal_Kabaddi_player(int total_Kabaddi_player) {
        this.total_Kabaddi_player = total_Kabaddi_player;
    }

    public int getExtra_kabaddi_player() {
        return extra_kabaddi_player;
    }

    public void setExtra_kabaddi_player(int extra_kabaddi_player) {
        this.extra_kabaddi_player = extra_kabaddi_player;
    }

    public String getPlace_of_Kabaddi_player() {
        return place_of_Kabaddi_player;
    }

    public void setPlace_of_Kabaddi_player(String place_of_Kabaddi_player) {
        this.place_of_Kabaddi_player = place_of_Kabaddi_player;
    }

    @Override
    public String toString() {
        return "KabaddiPlayer{" + "total_Kabaddi_player=" + total_Kabaddi_player + ", extra_kabaddi_player=" + extra_kabaddi_player + ", place_of_Kabaddi_player=" + place_of_Kabaddi_player + '}';
    }
      
}
