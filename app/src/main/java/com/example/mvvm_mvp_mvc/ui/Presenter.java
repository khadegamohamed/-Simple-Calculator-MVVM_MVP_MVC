package com.example.mvvm_mvp_mvc.ui;

import com.example.mvvm_mvp_mvc.pojo.NumberModel;

public class Presenter {
    Numberinterface numberinterface;

    public Presenter(Numberinterface numberinterface) {
        this.numberinterface = numberinterface;
    }

    public NumberModel getnumberMVP(){
        return new NumberModel(4,2);
    }
    public void getnumberonly(){
        numberinterface.onGetnumber(getnumberMVP());
    }
}
