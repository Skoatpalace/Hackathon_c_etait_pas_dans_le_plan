package com.example.wilder.candhaloween;

import android.graphics.drawable.Drawable;
import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BonbonModel {

    private String name;
    private Drawable photo;
    private double latitude;
    private  double longitude;
    private String compteur;



    public BonbonModel(String name, Drawable photo, double latitude, double longitude, String compteur) {

        this.name = name;
        this.photo = photo;
        this.latitude = latitude;
        this.longitude = longitude;
        this.compteur = compteur;
    }

    public BonbonModel(String name, Drawable photo, double latitude, double longitude) {

        this.name = name;
        this.photo = photo;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public BonbonModel() {
    }



    public  double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }


    public String getCompteur() {
        return compteur;
    }

    public void setCompteur(String compteur) {
        this.compteur = compteur;
    }
}






