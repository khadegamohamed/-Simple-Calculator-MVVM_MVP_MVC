package com.example.mvvm_mvp_mvc.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm_mvp_mvc.pojo.NumberModel;

public class Viewmodel extends ViewModel {
    MutableLiveData<NumberModel> mutableLiveData=new MutableLiveData<>();
    public NumberModel getnumberMVVM(){
        return new NumberModel(4,2);
    }
    public void getnumberonly(){
        mutableLiveData.setValue(getnumberMVVM());
    }
}
