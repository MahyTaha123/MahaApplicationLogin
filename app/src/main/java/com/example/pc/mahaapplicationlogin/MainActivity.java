package com.example.pc.mahaapplicationlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText password;
    Button logIn;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.password);
        signIn = (Button) findViewById(R.id.signIn);
        logIn = (Button) findViewById(R.id.logIn);
//////////////////////////////////////////////////////////////////////////////////////

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = userName.getText().toString();
                String pass = password.getText().toString();

                Intent intent = new Intent(MainActivity.this, LogIn.class);
                intent.putExtra("userName", name);
                intent.putExtra("password", pass);
                startActivity(intent);

            }
        });

//////////////////////////////////////////////////////////////////////////

        //SignIn
    ////////////////////

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);




            }
        });




    }
}
