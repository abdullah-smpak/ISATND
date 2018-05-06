package com.schoolerp.abdullah.schoolerp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.rengwuxian.materialedittext.MaterialEditText;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cn.pedant.SweetAlert.SweetAlertDialog;
import info.hoang8f.widget.FButton;

public class Login extends AppCompatActivity {
    FButton btnSignIn;
    MaterialEditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignIn = (FButton) findViewById(R.id.btnSignIn);
        user = (MaterialEditText)findViewById(R.id.edtPhone);
        pass = (MaterialEditText)findViewById(R.id.edtPassword);

        btnSignIn.setOnClickListener(new View.OnClickListener() {





            @Override
            public void onClick(View v) {

                Toast.makeText(Login.this,user.getText()+" "+pass.getText(),Toast.LENGTH_SHORT).show();

//                // DataBase Veiw
//
//                ERPcon connect = new ERPcon();
//                String query = "select _user,_pass,_Year from _reus_sys where _user = 'sami'";
//                Connection con = connect.CONN();
//
//              try {
//                    Toast.makeText(Login.this,"Try ke Andar",Toast.LENGTH_SHORT).show();
//                    Statement stmt = con.createStatement();
//                    ResultSet rs = stmt.executeQuery(query);
//
//
//                    while (rs.next()) {
//                        String a = rs.getString("_user");
//                        String b = rs.getString("_pass");
//                        String c = rs.getString("_Year");
//
//                        Toast.makeText(Login.this,a+" "+b+" "+c,Toast.LENGTH_SHORT).show();
//                    }
//
//                    //*Value SHow in the Combo Box*//*
//                }
//
//                catch (SQLException e) {
//                    Toast.makeText(Login.this, e.getMessage(), Toast.LENGTH_SHORT).show();
//                }
//
//                //Database View




                finish();
                Intent intent = new Intent(Login.this, Home.class);
                startActivity(intent);

            }
        });
    }


    public void onBackPressed() {
        new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Do You Want To Exit?")
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
                        finish();

                    }
                })
                .show();

    }


}
