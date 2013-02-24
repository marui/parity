package com.example.parity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChooseTaskActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_task);

        final Button button_cooking = (Button) findViewById(R.id.button_cooking);
        final TextView textView_cooking =(TextView) findViewById(R.id.textView_cooking);
        button_cooking.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent myIntent = new Intent(ChooseTaskActivity.this, CheckInTaskActivity.class);
                myIntent.putExtra("task_title", "Cooking");
                myIntent.putExtra("task_point", textView_cooking.getText());
                ChooseTaskActivity.this.startActivity(myIntent);
            }
        });
        final Button button_dishes = (Button) findViewById(R.id.button_dishes);
        final TextView textView_dishes =(TextView) findViewById(R.id.textView_dishes);
        button_dishes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent myIntent = new Intent(ChooseTaskActivity.this, CheckInTaskActivity.class);
                myIntent.putExtra("task_title", "Dishes");
                myIntent.putExtra("task_point", textView_dishes.getText());
                ChooseTaskActivity.this.startActivity(myIntent);
            }
        });



    }
}