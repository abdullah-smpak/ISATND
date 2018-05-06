package com.schoolerp.abdullah.schoolerp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class SK_legder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sk_legder);


        ArrayList<SK_legderCustom> f_list = new ArrayList<SK_legderCustom>();
        f_list.add(new SK_legderCustom("Invoice","001","12/01/2017","12000","30000"));
        f_list.add(new SK_legderCustom("Reciept","002","05/02/2017","11000","24000"));
        f_list.add(new SK_legderCustom("Invoice","003","10/03/2017","1000","24000"));
        f_list.add(new SK_legderCustom("Reciept","004","05/04/2017","5000","24000"));
        f_list.add(new SK_legderCustom("Invoice","005","07/05/2017","4000","24000"));
        f_list.add(new SK_legderCustom("Invoice","006","10/06/2017","6000","24000"));
        f_list.add(new SK_legderCustom("Invoice","007","01/07/2017","12000","24000"));
        f_list.add(new SK_legderCustom("Reciept","008","05/08/2017","45000","24000"));
        f_list.add(new SK_legderCustom("Reciept","009","05/09/2017","65000","24000"));
        f_list.add(new SK_legderCustom("Invoice","0010","05/10/2017","2000","50000"));

        SK_lagderAdapter adapter = new SK_lagderAdapter(this,f_list);
        android.widget.ListView list = (android.widget.ListView)findViewById(R.id.activity_sk_legder);
        list.setAdapter(adapter);

    }
}
