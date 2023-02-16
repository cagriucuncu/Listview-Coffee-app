package com.cagriucuncu.starbuzz.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.cagriucuncu.starbuzz.Model.Drink;
import com.cagriucuncu.starbuzz.R;
import com.cagriucuncu.starbuzz.Service.DrinkService;

public class DrinkActivity extends AppCompatActivity {
ImageView imgDrink;
TextView tvDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        Intent i = getIntent();
        Drink item = (Drink) i.getSerializableExtra(DrinkService.EXTRA_DRINK);

        init_UI();

        imgDrink.setImageDrawable(getDrawable( item.getInageResourceID()));
        tvDesc.setText(item.getDescription());

    }

    private void init_UI() {
        imgDrink = (ImageView)  findViewById(R.id.imgDrink);
        tvDesc = (TextView)  findViewById(R.id.tvDesc);
    }
}