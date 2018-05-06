package com.schoolerp.abdullah.schoolerp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by xdell on 12/29/2017.
 */


public class productAdapter extends ArrayAdapter<productCustom> {

    public productAdapter(Activity context, ArrayList<productCustom> lis) {
        super(context, 0, lis);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listV = convertView;

        if(listV == null){

            listV =   LayoutInflater.from(getContext()).inflate(R.layout.product_desing,parent,false);

        }

        productCustom num = getItem(position);
        TextView txt1 = (TextView)listV.findViewById(R.id.product);
        TextView txt2 = (TextView)listV.findViewById(R.id.Decs);
        TextView txt3 = (TextView)listV.findViewById(R.id.price);

        txt1.setText(num.getProduct());
        txt2.setText(num.getDesc());
        txt3.setText(num.getPrice());

        return listV;

    }
}
