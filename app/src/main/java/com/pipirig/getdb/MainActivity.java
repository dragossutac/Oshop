package com.pipirig.getdb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.pipirig.getdb.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    private ImageButton buttonBread ;
    private ImageButton buttonDairy ;
    private ImageButton buttonFruits ;
    private ImageButton buttonSeasonings ;
    private ImageButton buttonVegetables ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBread = (ImageButton) findViewById(R.id.imageButton);
        buttonDairy = (ImageButton) findViewById(R.id.imageButton2);
        buttonFruits = (ImageButton) findViewById(R.id.imageButton3);
        buttonSeasonings = (ImageButton) findViewById(R.id.imageButton4);
        buttonVegetables = (ImageButton) findViewById(R.id.imageButton5);


        buttonBread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductsActivity("Bread");
            }
        });
        buttonDairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductsActivity("Dairy");
            }
        });
        buttonFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductsActivity("Fruits");
            }
        });
        buttonSeasonings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductsActivity("Seasonings and Spices");
            }
        });
        buttonVegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductsActivity("Vegetables");
            }
        });
    }
    public void openProductsActivity(String category){
        Intent intent = new Intent(this, ProductsActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}
