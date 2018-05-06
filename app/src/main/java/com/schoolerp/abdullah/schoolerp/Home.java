package com.schoolerp.abdullah.schoolerp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import cn.pedant.SweetAlert.SweetAlertDialog;
import info.hoang8f.widget.FButton;

public class Home extends AppCompatActivity {
LinearLayout Empolyees,Sales,Purchase,PendingSales,PendingPurcahse,Expense,Assests;
    ImageView logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Empolyees = (LinearLayout)findViewById(R.id.Empolyees);
        Sales = (LinearLayout)findViewById(R.id.Sales);
        Purchase = (LinearLayout)findViewById(R.id.Purchase);
        PendingSales = (LinearLayout)findViewById(R.id.PendingSales);
        PendingPurcahse = (LinearLayout)findViewById(R.id.PendingPurcahse);
        Expense = (LinearLayout)findViewById(R.id.Expense);
        Assests = (LinearLayout)findViewById(R.id.Assests);

        logout = (ImageView)findViewById(R.id.logout);


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(Home.this, SweetAlertDialog.WARNING_TYPE)
                        .setTitleText("Do You Want To Logout?")
                        .setCancelText("No")
                        .setConfirmText("Yes")
                        .showCancelButton(true)
                        .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sDialog) {
                                sDialog.cancel();
                            }
                        })

                        .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sDialog) {
                                Intent intent = new Intent(Home.this,Login.class);
                                startActivity(intent);
                                finish();

                            }
                        })
                        .show();

            }
        });




        Empolyees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Home.this,Employess.class);
                startActivity(atn);
            }
        });


        Sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Home.this,Sales.class);
                startActivity(atn);
            }
        });


        Purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Home.this,Purchase.class);
                startActivity(atn);
            }
        });


        PendingSales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Home.this,PendingSales.class);
                startActivity(atn);
            }
        });

        PendingPurcahse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Home.this,PendingPurchase.class);
                startActivity(atn);
            }
        });

        Expense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Home.this,Expense.class);
                startActivity(atn);
            }
        });

        Assests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atn = new Intent(Home.this,Assets.class);
                startActivity(atn);
            }
        });



    }

    @Override
    public void onBackPressed() {
        new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Do You Want To Logout?")
                .setCancelText("No")
                .setConfirmText("Yes")
                .showCancelButton(true)
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        sDialog.cancel();
                    }
                })

                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                       Intent intent = new Intent(Home.this,Login.class);
                        startActivity(intent);
                        finish();

                    }
                })
                .show();




    }
}
