package com.hafsamehmood.myapplication;

public class Model {
    private int ImageBurger;
    private int ImageReviews;
    private int ImageDelete;
    private String BurgerName;
    private String BurgerType;
    private String BurgerReviews;
    private String Divider;

    public Model(int imageBurger, int imageReviews,int imageDelete, String burgerName, String burgerType, String burgerReviews, String divider) {
        ImageBurger = imageBurger;
        ImageReviews = imageReviews;
        BurgerName = burgerName;
        BurgerType = burgerType;
        BurgerReviews = burgerReviews;
        Divider = divider;
        ImageDelete=imageDelete;
    }

    public int getImageBurger() {
        return ImageBurger;
    }

    public int getImageReviews() {
        return ImageReviews;
    }

    public int getImageDelete() {
        return ImageDelete;
    }

    public String getBurgerName() {
        return BurgerName;
    }

    public String getBurgerType() {
        return BurgerType;
    }

    public String getBurgerReviews() {
        return BurgerReviews;
    }

    public String getDivider() {
        return Divider;
    }

    public void setImageBurger(int imageBurger) {
        ImageBurger = imageBurger;
    }

    public void setImageReviews(int imageReviews) {
        ImageReviews = imageReviews;
    }

    public void setImageDelete(int imageDelete) {
        ImageDelete = imageDelete;
    }

    public void setBurgerName(String burgerName) {
        BurgerName = burgerName;
    }

    public void setBurgerType(String burgerType) {
        BurgerType = burgerType;
    }

    public void setBurgerReviews(String burgerReviews) {
        BurgerReviews = burgerReviews;
    }

    public void setDivider(String divider) {
        Divider = divider;
    }
}
