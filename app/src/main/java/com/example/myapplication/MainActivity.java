package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button LogIn;
    private String userName = "Kantoro";
    private int userPassword = 333;
    private TextView Error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.Name);
        Password = (EditText) findViewById(R.id.Password);
        Error = (TextView) findViewById(R.id.Error);
        LogIn = (Button) findViewById(R.id.LogIn);

        Info.setText("fill in the fields");
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("Kantoro")) && (userPassword.equals("333"))) {
            Info.setText("Successful!");
        } else if ((userName.equals("")) && (userPassword.equals(""))) {
            Info.setText("fill in the fields!");
        } else {
            Info.setText("Incorrect password or name!");
        }
    }
}