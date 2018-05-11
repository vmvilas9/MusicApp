package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.icu.math.BigDecimal;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.paypal.android.MEP.CheckoutButton;
import com.paypal.android.MEP.PayPal;
import com.paypal.android.MEP.PayPalActivity;
import com.paypal.android.MEP.PayPalInvoiceData;
import com.paypal.android.MEP.PayPalPayment;

public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Button button1 = (Button) findViewById(R.id.payment_button_1);
        button1.setBackgroundColor(getColor(R.color.category_payment));
        button1.setText(getString(R.string.nowPlaying));
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(PaymentActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
        Button button2 = (Button) findViewById(R.id.payment_button_2);
        button2.setBackgroundColor(getColor(R.color.category_payment));
        button2.setText(getString(R.string.track));
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trackIntent = new Intent(PaymentActivity.this, TracksActivity.class);
                startActivity(trackIntent);
            }
        });
        Button button3 = (Button) findViewById(R.id.payment_button_3);
        button3.setBackgroundColor(getColor(R.color.category_payment));
        button3.setText(getString(R.string.mainActivity));
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(PaymentActivity.this, TracksActivity.class);
                startActivity(mainIntent);
            }
        });
        Button button4 = (Button) findViewById(R.id.payment_button_4);
        button4.setBackgroundColor(getColor(R.color.category_payment));
        button4.setText(getString(R.string.artist));
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(PaymentActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });
    }
}
