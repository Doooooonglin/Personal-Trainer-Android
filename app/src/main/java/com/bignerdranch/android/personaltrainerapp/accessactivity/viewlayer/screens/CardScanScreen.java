package com.bignerdranch.android.personaltrainerapp.accessactivity.viewlayer.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bignerdranch.android.personaltrainerapp.R;
import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.AccessHandler;
import com.bignerdranch.android.personaltrainerapp.accessactivity.businesslayer.ChargeSlip;
import com.bignerdranch.android.personaltrainerapp.accessactivity.datalayer.MemberCard;
import com.bignerdranch.android.personaltrainerapp.database.helperclass.GlobalAppContextSingleton;

public class CardScanScreen extends AppCompatActivity {
    private AccessHandler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_scan_screen);

        GlobalAppContextSingleton.getInstance().initialize(this);
    }

    public void retrieveMemberCardInfo(int membershipID) {
        mHandler = new AccessHandler();

        MemberCard card = mHandler.RetrieveMemberCardInfo(membershipID);
        String type = card.getMembership().getType();
    }

    public void createChargeSlip(String memberName, String activityName, String paymentType, double amount, String date, String memberType) {
        int transactionID = mHandler.CreateChargeSlip(memberName, activityName, paymentType, amount, date, memberType);
    }

    public void UpdateSlipSignature(int transactionID, boolean hasSignature) {
        AccessHandler handler = new AccessHandler();
        handler.UpdateSlipSignature(transactionID, hasSignature);
    }
}