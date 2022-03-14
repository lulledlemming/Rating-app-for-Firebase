package com.dandy.ratingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class RateAdapter(val mCtxt:Context, val layoutResId: Int,val RateList:List<Rate>)
    :ArrayAdapter<Rate>(mCtxt,layoutResId,RateList)


{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater= LayoutInflater.from(mCtxt);
        val view:View= layoutInflater.inflate(layoutResId,null );

        val txtView= view.findViewById<TextView>(R.id.textHolder);

        val rate= RateList[position];
        txtView.text=rate.name;
        return view;
    }
}