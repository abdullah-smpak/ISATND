package com.schoolerp.abdullah.schoolerp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Employess extends AppCompatActivity {

    TextView tot,pre,abs,late,lve;
   TextView totval,preval,absval,lateval,lveval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employess);

        tot = (TextView)findViewById(R.id.TOTAL);
        pre = (TextView)findViewById(R.id.PRESENT);
        abs = (TextView)findViewById(R.id.ABSENT);
        late = (TextView)findViewById(R.id.LATE);
        lve = (TextView)findViewById(R.id.LEAVE);

        totval = (TextView)findViewById(R.id.TOTALVAL);
        preval = (TextView)findViewById(R.id.PRESENTVAL);
        absval = (TextView)findViewById(R.id.ABSENTVAL);
        lateval = (TextView)findViewById(R.id.LATEVAL);
        lveval = (TextView)findViewById(R.id.LEAVEVAL);

        tot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Employess.this,productlist.class);
                startActivity(atn);
            }
        });

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Employess.this,productlist.class);
                startActivity(atn);
            }
        });

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Employess.this,productlist.class);
                startActivity(atn);
            }
        });

        late.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Employess.this,productlist.class);
                startActivity(atn);
            }
        });

        lve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Employess.this,productlist.class);
                startActivity(atn);
            }
        });

    }
}
