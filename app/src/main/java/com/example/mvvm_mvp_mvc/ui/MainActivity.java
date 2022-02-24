package com.example.mvvm_mvp_mvc.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mvvm_mvp_mvc.R;
import com.example.mvvm_mvp_mvc.databinding.ActivityMainBinding;
import com.example.mvvm_mvp_mvc.pojo.NumberModel;

public class MainActivity extends AppCompatActivity implements Numberinterface {
ActivityMainBinding binding;
Presenter presenter;
Viewmodel viewmodel;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View vbinding = binding.getRoot();
        setContentView(vbinding);
        presenter = new Presenter(this);
        //MVC
binding.buttonmult.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
         NumberModel numberModel = getnumberMVC();
          int firstnumber= numberModel.getFirstnumber();
         int secoundnumber = numberModel.getSecondnumber();
         binding.firstnumber.setText(numberModel.getFirstnumber()+"");
         binding.secondnumber.setText(numberModel.getSecondnumber()+"");
         binding.mult.setText((firstnumber*secoundnumber)+"");
    }
});
//MVP
binding.buttonadd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    presenter.getnumberonly();
    }
});
//MVVM
viewmodel= new ViewModelProvider(this).get(Viewmodel.class);
viewmodel.mutableLiveData.observe(this, new Observer<NumberModel>() {
    @Override
    public void onChanged(NumberModel numberModel) {
        int firstnumber= numberModel.getFirstnumber();
        int secoundnumber = numberModel.getSecondnumber();
        binding.firstnumber.setText(numberModel.getFirstnumber()+"");
        binding.secondnumber.setText(numberModel.getSecondnumber()+"");
        binding.sub.setText((firstnumber-secoundnumber)+"");
    }
});
binding.buttonsub.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        viewmodel.getnumberonly();
    }
});

    }
    //forMVC
    public NumberModel getnumberMVC(){
        return new NumberModel(4,2);
    }
    @Override
    public void onGetnumber(NumberModel numberModel) {
        int firstnumber= numberModel.getFirstnumber();
        int secoundnumber = numberModel.getSecondnumber();
        binding.firstnumber.setText(numberModel.getFirstnumber()+"");
        binding.secondnumber.setText(numberModel.getSecondnumber()+"");
        binding.add.setText((firstnumber+secoundnumber)+"");
    }
}