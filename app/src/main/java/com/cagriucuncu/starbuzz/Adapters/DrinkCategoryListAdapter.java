package com.cagriucuncu.starbuzz.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cagriucuncu.starbuzz.Model.Drink;
import com.cagriucuncu.starbuzz.R;

import java.util.ArrayList;

public class DrinkCategoryListAdapter extends BaseAdapter {
    ArrayList<Drink> items ;
    Context context;

    public DrinkCategoryListAdapter(ArrayList<Drink> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Drink getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView ==null){
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.drink_list_item,
                            parent,false);
        }

        TextView t = (TextView) convertView.findViewById(R.id.textView);
        ImageView i = (ImageView) convertView.findViewById(R.id.imageView2);

        t.setText(items.get(position).getName());
        i.setImageDrawable(context.getDrawable(items.get(position).getInageResourceID()));
        return convertView;
    }
}
