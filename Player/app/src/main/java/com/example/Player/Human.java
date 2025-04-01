/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Player;

/**
 *
 * @author sonam
 */
public class Human {
    private String name;
  private int age; 
  private String dob;
  private String education;
  private String gender;
    

   public Human(String name, int age, String dob, String education, String gender) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.education = education;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public String getEducation() {
        return education;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
  
}
