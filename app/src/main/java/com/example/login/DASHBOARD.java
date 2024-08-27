package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DASHBOARD extends AppCompatActivity {
    private Button next;
    private EditText item_text, description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        item_text = findViewById(R.id.item_text);
        description = findViewById(R.id.description);

        next=findViewById(R.id.button3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemValue = item_text.getText().toString(); // Move this line inside onClick
                Log.e("get" , itemValue);
                String descriptionValue = description.getText().toString().trim(); // Move this line inside onClick
                Intent intent=new Intent(getApplicationContext(),mainscreen.class);
                intent.putExtra("item",itemValue);
                startActivity(intent);
            }
        });
    }
}
