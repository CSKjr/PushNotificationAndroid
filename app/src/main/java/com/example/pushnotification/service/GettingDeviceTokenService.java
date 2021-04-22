package com.example.pushnotification.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.messaging.FirebaseMessagingService;

public class GettingDeviceTokenService extends FirebaseMessagingService {

//    @Override
//    public void onNewToken(String s) {
//        super.onNewToken(s);
////        Log.d("NEW_TOKEN",s);
//    }


    @Override
    public void onNewToken(@NonNull String s) {
//        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        super.onNewToken(s);
        Log.d("NEW_TOKEN",s);
    }
}