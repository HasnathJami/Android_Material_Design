package com.example.android_material_design;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RadioButtonCheckBoxPractice extends AppCompatActivity {

    RadioButton rb1,rb2;
    RadioGroup rg;
    int score=0;
    CheckBox cb1,cb2,cb3;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_check_box_practice);
        rb1=findViewById(R.id.radioButton1);
        rb2=findViewById(R.id.radioButton2);
        rg=findViewById(R.id.radioGroupId);
        cb1=findViewById(R.id.cb1Id);
        cb2=findViewById(R.id.cb2Id);
        cb3=findViewById(R.id.cb3Id);
        btn=findViewById(R.id.buttonId);



        if(cb1.isChecked() && cb2.isChecked() && !cb3.isChecked() )
        {
            score++;
            // Toast.makeText(RadioButtonCheckBoxPractice.this, "Your score is:"+score, Toast.LENGTH_SHORT).show();
        }

        else
        {
            score--;
            // Toast.makeText(RadioButtonCheckBoxPractice.this, "Your score is:"+score, Toast.LENGTH_SHORT).show();
        }


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {



            }
        });

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isChecked())
                {
                    score++;
                }
                else{
                    score--;
                }
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isChecked())
                {
                    score++;
                }
                else{
                    score--;
                }
            }
        });






        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Toast.makeText(RadioButtonCheckBoxPractice.this, "Your score is:  "+score, Toast.LENGTH_SHORT).show();
                rg.clearCheck();
                score=0;

            }
        });



    }
}