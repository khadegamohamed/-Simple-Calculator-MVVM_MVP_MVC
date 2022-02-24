package com.example.mvvm_mvp_mvc.pojo;

public class NumberModel {
    private int firstnumber , secondnumber;

    public NumberModel(int firstnumber , int secondnumber) {
        this.firstnumber = firstnumber;
        this.secondnumber = secondnumber;
    }

    public int getFirstnumber() {
        return firstnumber;
    }

    public int getSecondnumber() {
        return secondnumber;
    }
}
