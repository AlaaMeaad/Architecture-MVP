package com.example.architecturemvp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.architecturemvp.R;
import com.example.architecturemvp.pojo.MoiveModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , MoiveView {
    TextView getdata;
    Button butGetData;
    MoivePresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getdata = findViewById(R.id.textview);
        butGetData = findViewById(R.id.button);
        butGetData.setOnClickListener(this);
         presenter = new MoivePresenter(this);
    }


    ///////////////////////////    controller       //////////////////////////////////




    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
                presenter.getMoiveName();
        }
    }

    @Override
    public void doneGetMoiveName(String name) {
        getdata.setText(name);
    }
}
