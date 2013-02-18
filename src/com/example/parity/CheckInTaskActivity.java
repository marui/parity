package com.example.parity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheckInTaskActivity extends Activity{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkin_task);

        Intent intent = getIntent();
        String value = intent.getStringExtra("task_title");
        final TextView task_title = (TextView) findViewById(R.id.textView_task_title);
        task_title.setText(value);


        final Button button_dishes = (Button) findViewById(R.id.button_confirm);
        button_dishes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent myIntent = new Intent(CheckInTaskActivity.this, MainActivity.class);
                myIntent.putExtra("confirm_message", "I have done " + task_title.getText());
                CheckInTaskActivity.this.startActivity(myIntent);
            }
        });
    }
}
