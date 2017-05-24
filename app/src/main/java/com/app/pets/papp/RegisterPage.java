package com.app.pets.papp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class RegisterPage extends AppCompatActivity {

    @BindView(R.id.petname)
    TextView username;

    @BindView(R.id.password)
    TextView password;

    @BindView(R.id.signinbutton)
    Button signin;

    @BindView(R.id.registerbutton)
    Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.signinbutton)
    public void signin_clicked(){
        Toast.makeText(this,"Welcome.",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,HomeActivity.class);
        startActivity(intent);

    }

}
