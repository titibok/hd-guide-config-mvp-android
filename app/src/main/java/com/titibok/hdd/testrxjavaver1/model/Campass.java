package com.titibok.hdd.testrxjavaver1.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by duonghd on 8/9/2017.
 */

public class Campass implements Serializable {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    public Campass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Campass() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
