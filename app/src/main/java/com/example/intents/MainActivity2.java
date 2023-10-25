package com.example.intents;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView tvFirstName;
    TextView tvLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        tvFirstName = findViewById(R.id.firstName);
        Bundle bundle = intent.getExtras();
        assert bundle != null;
        String firstName = bundle.getString("firstNameKey");
        tvFirstName.setText(firstName + " Mzii");
        Toast.makeText(getApplicationContext(), firstName, Toast.LENGTH_LONG).show();

        //lastname
        tvLastName = findViewById(R.id.lastName);
        String lastName = bundle.getString("lastNameKey");
        tvLastName.setText(lastName);
        Toast.makeText(getApplicationContext(), lastName, Toast.LENGTH_LONG).show();

    }
}
