package com.example.parity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button button = (Button) findViewById(R.id.checkin);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent myIntent = new Intent(MainActivity.this, ChooseTaskActivity.class);
                MainActivity.this.startActivity(myIntent);

            }
        });

        Intent intent = getIntent();
        String confirm_message_value = intent.getStringExtra("confirm_message");
        final TextView confirm_message = (TextView) findViewById(R.id.textView_confirm_message);
        confirm_message.setText(confirm_message_value);

        String task_point_value = intent.getStringExtra("task_point");
        final TextView task_point = (TextView) findViewById(R.id.textView_task_point);
        task_point.setText(task_point_value);

        String comment_value = intent.getStringExtra("comment");
        final TextView comment = (TextView) findViewById(R.id.textView_comment);
        comment.setText(comment_value);

    }
}

