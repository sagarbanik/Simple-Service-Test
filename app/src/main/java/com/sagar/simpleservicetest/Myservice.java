package com.sagar.simpleservicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class Myservice extends IntentService {

    public Myservice() {
        super("Myservice");
    }



    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("myservice", "onHandleIntent: Working Fine");

    }
}
