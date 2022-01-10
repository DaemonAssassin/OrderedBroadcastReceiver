package com.gmail.mateendev3.orderedbroadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Receiver1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (isOrderedBroadcast()) {
            int initialCode = getResultCode();
            String initialData = getResultData();
            Bundle bundle = getResultExtras(true);
            String order = bundle.getString("order");

            initialCode++;
            order += "-> BR1";

            String output = "Initial Code: " + initialCode + "\n"
                    + "Initial Data: " + initialData + "\n"
                    + "Initial Order" + order;

            Toast.makeText(context, output, Toast.LENGTH_SHORT).show();

            initialData = "BR1";

            bundle.putString("order", order);

            setResult(initialCode, initialData, bundle);

        }
    }
}
