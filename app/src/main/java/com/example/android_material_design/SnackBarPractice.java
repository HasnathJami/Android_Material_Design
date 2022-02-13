package com.example.android_material_design;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.snackbar.Snackbar;

public class SnackBarPractice extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snack_bar_practice);
        constraintLayout=findViewById(R.id.constraintId);


        Snackbar snackbar = Snackbar.make(constraintLayout,"This is snackbar", Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("Undo", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        snackbar.setActionTextColor(Color.MAGENTA);
        snackbar.setTextColor(Color.YELLOW);







        snackbar.show();

    }
}