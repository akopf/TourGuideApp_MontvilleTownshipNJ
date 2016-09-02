package com.example.android.montvillenj;

public class MontvillePlaces {

    private int montPlace;
    private int montAddress;
    private int montPhone;
    private int montWebsite;
    private int imageId;
    public MontvillePlaces(int place, int address, int phone, int website, int image){
        montPlace = place;
        montAddress = address;
        montPhone = phone;
        montWebsite = website;
        imageId = image;
    }
    public int getMontPlace(){
        return montPlace;
    }
    public int getMontAddress() {
        return montAddress;
    }
    public int getMontPhone() {
        return montPhone;
    }
    public int getMontWebsite() {
        return montWebsite;
    }
    public int getImageId() {
        return imageId;
    }
    }
