package com.schoolerp.abdullah.schoolerp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PendingPurchase extends AppCompatActivity {

    TextView today,mtd,ytd;
    TextView todayval,mtdval,ytdval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_purchase);

        today = (TextView)findViewById(R.id.TODAY);
        mtd = (TextView)findViewById(R.id.MTD);
        ytd = (TextView)findViewById(R.id.YTD);

        today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(PendingPurchase.this,productlist.class);
                startActivity(atn);
            }
        });

        mtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(PendingPurchase.this,productlist.class);
                startActivity(atn);
            }
        });

        ytd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(PendingPurchase.this,productlist.class);
                startActivity(atn);
            }
        });

    }
}
