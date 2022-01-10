package com.gmail.mateendev3.orderedbroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.gmail.mateendev3.orderedbroadcastreceiver.receiver.Receiver3;

public class MainActivity extends AppCompatActivity {
    Receiver3 mReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mReceiver = new Receiver3();
        IntentFilter filter = new IntentFilter("PakistanZindabad");
        filter.setPriority(30);
        registerReceiver(mReceiver, filter);
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(mReceiver);
        super.onDestroy();
    }
}