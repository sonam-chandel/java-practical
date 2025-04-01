/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Player.sample2;

import com.example.Player.sample1.KabaddiPlayer;

/**
 *
 * @author sonam
 */
public class Coach extends KabaddiPlayer {
    private String Type_of_kabbaddi_Coach;

    public Coach(String Type_of_kabbaddi_Coach, int total_Kabaddi_player, int extra_kabaddi_player, String place_of_Kabaddi_player, String country_of_player, String type_of_player, String category_of_age, String experience, String name, int age, String dob, String education, String gender) {
        super(total_Kabaddi_player, extra_kabaddi_player, place_of_Kabaddi_player, country_of_player, type_of_player, category_of_age, experience, name, age, dob, education, gender);
        this.Type_of_kabbaddi_Coach = Type_of_kabbaddi_Coach;
    }

    public String getType_of_kabbaddi_Coach() {
        return Type_of_kabbaddi_Coach;
    }

    public void setType_of_kabbaddi_Coach(String Type_of_kabbaddi_Coach) {
        this.Type_of_kabbaddi_Coach = Type_of_kabbaddi_Coach;
    }

    @Override
    public String toString() {
        return "Coach{" + "Type_of_kabbaddi_Coach=" + Type_of_kabbaddi_Coach + '}';
    }
}
