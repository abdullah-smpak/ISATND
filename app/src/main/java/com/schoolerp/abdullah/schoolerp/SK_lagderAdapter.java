package com.schoolerp.abdullah.schoolerp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sony on 12/26/2017.
 */



public class SK_lagderAdapter extends ArrayAdapter<SK_legderCustom> {

    public SK_lagderAdapter(Activity context, ArrayList<SK_legderCustom> lis) {
        super(context, 0, lis);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listV = convertView;

        if(listV == null){

            listV =   LayoutInflater.from(getContext()).inflate(R.layout.legder_desing,parent,false);

        }

        SK_legderCustom num = getItem(position);
        TextView txt1 = (TextView)listV.findViewById(R.id.legtype);
        TextView txt2 = (TextView)listV.findViewById(R.id.invNum);
        TextView txt3 = (TextView)listV.findViewById(R.id.InvDate);
        TextView txt4 = (TextView)listV.findViewById(R.id.legamn);
        TextView txt5 = (TextView)listV.findViewById(R.id.balnce);

        txt1.setText(num.getLegType());
        txt2.setText(num.getLegNum());
        txt3.setText(num.getLegDate());
        txt4.setText(num.getLegAmn());
        txt5.setText(num.getBalance());

        return listV;

    }
}
