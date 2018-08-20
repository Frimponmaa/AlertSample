package com.eunicefrimponmaa.alertsample;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(MainActivity.this);
        //set the title
        myAlertBuilder.setTitle("Alert");
        //set dialog message
        myAlertBuilder.setMessage("Click OK to continue or Cancel to stop:");

        //add buttons
        //positive button
        myAlertBuilder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //message to display to user when ok button is pressed
                Toast.makeText(getApplicationContext(), R.string.pressed_ok, Toast.LENGTH_SHORT).show();
            }
        });

        //negative button
        myAlertBuilder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), R.string.pressed_cancel, Toast.LENGTH_SHORT).show();
            }
        });

        //create and show alert diaglog
        myAlertBuilder.show();
    }
}
