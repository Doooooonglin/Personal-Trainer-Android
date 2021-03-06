package com.bignerdranch.android.personaltrainerapp.accessactivity.viewlayer.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bignerdranch.android.personaltrainerapp.R;
import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.AccessHandler;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.GlobalAppContextSingleton;

public class SlipSignScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slip_sign_screen);

        GlobalAppContextSingleton.getInstance().initialize(this);
    }

    public void UpdateSlipSignature(int transactionID, boolean hasSignature) {
        AccessHandler handler = new AccessHandler();

        handler.UpdateSlipSignature(transactionID, hasSignature);
    }
}