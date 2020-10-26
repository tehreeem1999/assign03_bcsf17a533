package com.example.homework_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioGroup radioGroup1;
    RadioButton radioButton1;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup1 = findViewById(R.id.radioGroup1);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2= findViewById(R.id.checkBox2);
        checkBox3= findViewById(R.id.checkBox3);
        checkBox4= findViewById(R.id.checkBox4);
        textView = findViewById(R.id.textViewResults);
        Button bt1= findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (MainActivity.this,selectdoptions.class);
                startActivity(intent);


            }
        });

    }

    public void ShowSelection(View view) {

        int checked = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(checked);
        textView.setText(radioButton.getText());

    }

    public void ShowSelection1(View view) {

        int checked = radioGroup1.getCheckedRadioButtonId();
        radioButton = findViewById(checked);
        textView.setText(radioButton.getText());

    }

    public void  ShowSelection2(View view)
    {
        int checked = checkBox1.getId();
        checkBox1 = findViewById(checked);
        textView.setText(checkBox1.getText());

    }

    public void  ShowSelection3(View view)
    {
        int checked = checkBox2.getId();
        checkBox2 = findViewById(checked);
        textView.setText(checkBox2.getText());

    }

    public void  ShowSelection4(View view)
    {
        int checked = checkBox3.getId();
        checkBox3 = findViewById(checked);
        textView.setText(checkBox3.getText());

    }

    public void  ShowSelection5(View view)
    {
        int checked = checkBox4.getId();
        checkBox4 = findViewById(checked);
        textView.setText(checkBox4.getText());

    }




}