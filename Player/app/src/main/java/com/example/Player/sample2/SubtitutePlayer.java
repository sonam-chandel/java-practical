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
public class SubtitutePlayer extends KabaddiPlayer {
     private int No_of_mathches;

    public SubtitutePlayer(int No_of_mathches, int total_Kabaddi_player, int extra_kabaddi_player, String place_of_Kabaddi_player, String country_of_player, String type_of_player, String category_of_age, String experience, String name, int age, String dob, String education, String gender) {
        super(total_Kabaddi_player, extra_kabaddi_player, place_of_Kabaddi_player, country_of_player, type_of_player, category_of_age, experience, name, age, dob, education, gender);
        this.No_of_mathches = No_of_mathches;
    }

    public int getNo_of_mathches() {
        return No_of_mathches;
    }

    public void setNo_of_mathches(int No_of_mathches) {
        this.No_of_mathches = No_of_mathches;
    }

    @Override
    public String toString() {
        return "SubtitutePlayer{" + "No_of_mathches=" + No_of_mathches + '}';
    }
    
}
