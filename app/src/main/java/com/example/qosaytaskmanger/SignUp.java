package com.example.qosaytaskmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity
{
    private EditText etFname;
    private EditText etLname;
    private EditText etPhone;
    private EditText etEmail;
    private EditText etPassword;
    private EditText etRpassword;
    private Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etFname=(EditText)findViewById(R.id.etFname);
        etLname=(EditText)findViewById(R.id.etLname);
        etPhone=(EditText)findViewById(R.id.etPhone);
        etEmail=(EditText)findViewById(R.id.etEmail);
        etPassword=(EditText)findViewById(R.id.etPassword);
        etRpassword=(EditText)findViewById(R.id.etRpassword);
        btnSave=(Button) findViewById(R.id.btnSave);
    }
}
