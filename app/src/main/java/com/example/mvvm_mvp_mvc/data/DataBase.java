package com.example.mvvm_mvp_mvc.data;

import com.example.mvvm_mvp_mvc.pojo.NumberModel;

public class DataBase {
    public NumberModel getNumber(){
        return new NumberModel(4,2);
    }
}
