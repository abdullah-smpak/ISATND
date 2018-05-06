package com.schoolerp.abdullah.schoolerp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class productlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productlist);

        ArrayList<productCustom> f_list = new ArrayList<productCustom>();
        f_list.add(new productCustom("Product","12/01/2017","Paid"));
        f_list.add(new productCustom("Product","05/02/2017","Paid"));
        f_list.add(new productCustom("Product","10/03/2017","Paid"));
        f_list.add(new productCustom("Product","05/04/2017","Paid"));
        f_list.add(new productCustom("Product","07/05/2017","Paid"));
        f_list.add(new productCustom("Product","10/06/2017","Paid"));
        f_list.add(new productCustom("Product","01/07/2017","Paid"));
        f_list.add(new productCustom("Product","05/08/2017","Paid"));
        f_list.add(new productCustom("Product"," ","Un-Paid"));
        f_list.add(new productCustom("Product"," ","Un-Paid"));

        productAdapter adapter = new productAdapter(this,f_list);
        android.widget.ListView list = (android.widget.ListView)findViewById(R.id.activity_productlist);
        list.setAdapter(adapter);



    }
}
