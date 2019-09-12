package com.example.qosaytaskmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;

public class Settings extends AppCompatActivity {
    private EditText etSound;
    private Switch Switch1;
    private EditText etFontSound;
    private SeekBar Sk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        etSound=(EditText)findViewById(R.id.etSound);
        Switch1=(Switch)findViewById(R.id.Switch1);
        etFontSound=(EditText)findViewById(R.id.etFontSize);
        Sk=(SeekBar)findViewById(R.id.Sk);
    }
}
