package com.example.architecturemvp.ui;

import com.example.architecturemvp.pojo.MoiveModel;

public class MoivePresenter {

    MoiveView view;

    public MoivePresenter(MoiveView view) {
        this.view = view;
    }
    public MoiveModel moiveModeldatabase(){
        return new MoiveModel("alaa" , "meaad" , "zamalek" , 1);
    }

    public  void getMoiveName(){
        view.doneGetMoiveName(moiveModeldatabase().getName());
    }
}
