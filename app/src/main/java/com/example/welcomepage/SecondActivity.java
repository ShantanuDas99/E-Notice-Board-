package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView mmdu,department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mmdu = (CardView) findViewById(R.id.mmdu);
        department = (CardView) findViewById(R.id.department);

        mmdu.setOnClickListener(this);
        department.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.mmdu: i = new Intent(this,mmdu.class);startActivity(i);break;
            case R.id.department: i = new Intent(this,department.class);startActivity(i);break;
            default:break;
        }

    }
}
