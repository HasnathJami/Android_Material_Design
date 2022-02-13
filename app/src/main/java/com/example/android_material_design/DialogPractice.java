package com.example.android_material_design;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class DialogPractice extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_practice);

//        AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
//        alertDialog.setMessage("Are you sure?");
//        //alertDialog.setTitle("OOOOOOOOOOOOO");
//        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(getApplicationContext(), "Yes", Toast.LENGTH_SHORT).show();
//            }
//        });
//        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(DialogPractice.this, "No", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        alertDialog.show();

        MaterialAlertDialogBuilder materialAlertDialogBuilder=new MaterialAlertDialogBuilder(this);
        materialAlertDialogBuilder.setTitle("Are you Sure want to quit?");
        //materialAlertDialogBuilder.setMessage("You will leave the app");
        materialAlertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        materialAlertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        String items[]={"jishan","sayem","h","ha"};
        materialAlertDialogBuilder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        materialAlertDialogBuilder.show();


    }
}