package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    public EditText Roll_Number,Id_Number;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Spinner userSpin =(Spinner)findViewById(R.id.spinner1);
        Roll_Number = (EditText)findViewById(R.id.etText);
        Password = (EditText)findViewById(R.id.etText2);
        Login = (Button)findViewById(R.id.button);


        ArrayAdapter<String> userAdapter = new ArrayAdapter<String>(Main2Activity.this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.choose));
        userAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        userSpin.setAdapter(userAdapter);



        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Roll_Number.getText().toString(), Password.getText().toString());
            }
        });
    }
    private void validate(String username, String userPassword){
        if((username.equals("11182509")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(Main2Activity.this, SecondActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(Main2Activity.this, "Invalid Username/Password",Toast.LENGTH_LONG).show();
        }

    }
    public void valid(String Admin, String Student){
        if (Admin.
    }
}
