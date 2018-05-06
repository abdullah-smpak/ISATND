package com.schoolerp.abdullah.schoolerp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class Order extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    public  static String code = "";
    Button QRcode;
    private ZXingScannerView scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        QRcode = (Button)findViewById(R.id.QR);
        final Activity activity = this;
        QRcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scan = new ZXingScannerView(getApplicationContext());
                setContentView(scan);
                scan.setResultHandler(Order.this);
                scan.startCamera();
            }
        });

    }

    @Override
    public void handleResult(Result result) {
        Toast.makeText(getApplicationContext(),result.getText(),Toast.LENGTH_SHORT).show();
        code = result.getText();
        Intent ints = new Intent(this,SQLite.class);
        startActivity(ints);
        scan.resumeCameraPreview(this);

    }
}
