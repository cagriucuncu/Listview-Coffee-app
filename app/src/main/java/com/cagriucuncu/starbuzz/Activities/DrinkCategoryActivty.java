package com.cagriucuncu.starbuzz.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.cagriucuncu.starbuzz.Adapters.DrinkCategoryListAdapter;
import com.cagriucuncu.starbuzz.Model.Drink;
import com.cagriucuncu.starbuzz.R;
import com.cagriucuncu.starbuzz.Service.DrinkService;

public class DrinkCategoryActivty extends AppCompatActivity {

    ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category_activty);

        init_UI();

        ArrayAdapter<Drink> adapter = new ArrayAdapter<Drink>(this,R.layout.drink_list_item, R.id.textView, DrinkService.getDrinks());
        DrinkCategoryListAdapter adapter1 = new DrinkCategoryListAdapter(DrinkService.getDrinks(), this);

        listView1.setAdapter(adapter1);
    }

    private void init_UI() {
        listView1 = (ListView)  findViewById(R.id.listView1);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drink clickedItem = (Drink) listView1.getItemAtPosition(position);

                Intent i = new Intent(DrinkCategoryActivty.this, DrinkActivity.class);
                i.putExtra(DrinkService.EXTRA_DRINK,  clickedItem);

                startActivity(i);
            }
        });
    }
}