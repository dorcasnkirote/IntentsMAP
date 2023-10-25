package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView textView;
    public EditText fname, lname, regNo, number;
    public Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = findViewById(R.id.firstName);
        lname = findViewById(R.id.lastName);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(view -> {
                    String firstName = fname.getText().toString();
                    String lastName = String.valueOf(lname.getText());
                    navigateToScreen2(firstName,lastName);
                }
        );
    }

    private void navigateToScreen2(String firstName,String lastName) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("firstNameKey", firstName);
        intent.putExtra("lastNameKey", lastName);
        startActivity(intent);
    }
}