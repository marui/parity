package com.example.parity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseTaskActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_task);

        final Button button_cooking = (Button) findViewById(R.id.button_cooking);
        button_cooking.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent myIntent = new Intent(ChooseTaskActivity.this, CheckInTaskActivity.class);
                myIntent.putExtra("task_title", "Cooking");
                ChooseTaskActivity.this.startActivity(myIntent);
            }
        });
        final Button button_dishes = (Button) findViewById(R.id.button_dishes);
        button_dishes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent myIntent = new Intent(ChooseTaskActivity.this, CheckInTaskActivity.class);
                myIntent.putExtra("task_title", "Dishes");
                ChooseTaskActivity.this.startActivity(myIntent);
            }
        });
    }
}