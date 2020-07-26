package com.example.ecommlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener
{
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button=(Button) findViewById(R.id.register);
        button.setOnClickListener(this);
    }

    public void activity_register(){
        Intent intent=new Intent(this, register.class);
        startActivity(intent);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.register:activity_register();
                break;
        }

    }
}
