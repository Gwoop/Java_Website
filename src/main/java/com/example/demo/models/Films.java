package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;


@Entity
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
  /*  String name,dicription,studio;
    int likes;
    int dislikes;*/


    @NotEmpty(message = "Поле не может быть пустым")
    @Size(message = "Строка не может быть меньше",min = 3,max = 1000)
    String name;
    @NotEmpty(message = "Поле не может быть пустым")
    @Size(message = "Строка не может быть меньше",min = 3,max = 1000)
    String dicription;
    @NotNull(message = "Поле не может быть пустым")
    String studio;
    @Min(message = "Число не может быть отрицательным",value = 0)
    @Max(message = "Число не может быть отрицательным", value = 1000)
    @NotNull (message = "Обязательно к заполнению")
    Integer dislikes,likes;

    public Films() {

    }


    public Films(String name, String dicription, String studio, int likes, int dislikes) {
        this.name = name;
        this.dicription = dicription;
        this.studio = studio;
        this.likes = likes;
        this.dislikes = dislikes;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDicription() {
        return dicription;
    }

    public String getStudio() {
        return studio;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDicription(String dicription) {
        this.dicription = dicription;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }


}
