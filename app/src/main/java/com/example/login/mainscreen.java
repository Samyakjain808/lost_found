package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class mainscreen extends AppCompatActivity {
    ImageButton sbutton;
    ImageView item_image;

    TextView name_of_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

        Intent intent = getIntent();
        String item_get = intent.getStringExtra("item").trim();

        name_of_item = findViewById(R.id.name_of_item);

        item_image = findViewById(R.id.item_image);
        if (item_get.equals("dell charger")) {
            name_of_item.setText("ITEM NAME:" + item_get.toUpperCase());
            item_image.setImageResource(R.drawable.charger);
        }
        else if (item_get.equals("iphone")) {
            name_of_item.setText("ITEM NAME:" + item_get.toUpperCase());
            item_image.setImageResource(R.drawable.iphone);
        }
        else if (item_get.equals("bottle")) {
            name_of_item.setText("ITEM NAME:" + item_get.toUpperCase());
            item_image.setImageResource(R.drawable.bootle);
        }
        else if (item_get.equals("samsung earpods")) {
            name_of_item.setText("ITEM NAME:" + item_get.toUpperCase());
            item_image.setImageResource(R.drawable.buds);
        }
        else if (item_get.equals("car key"))  {
            name_of_item.setText("ITEM NAME:" + item_get.toUpperCase());
            item_image.setImageResource(R.drawable.key);
        }
        else if (item_get.equals("laptop cover")) {
            name_of_item.setText("ITEM NAME:" + item_get.toUpperCase());
            item_image.setImageResource(R.drawable.air);

        }
        else if (item_get.equals("ring")) {
            name_of_item.setText("ITEM NAME:" + item_get.toUpperCase());
            item_image.setImageResource(R.drawable.ring);

        }
        else {
            name_of_item.setText("");
            item_image.setImageResource(R.drawable.item_not_found);
        }

        sbutton=findViewById(R.id.imageView2);
        sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),drawable.class);
                startActivity(intent);
            }
        });
    }
}