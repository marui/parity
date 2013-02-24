package com.example.parity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
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
        String task_title_value = intent.getStringExtra("task_title");
        final TextView task_title = (TextView) findViewById(R.id.textView_task_title);
        task_title.setText(task_title_value);

        String task_point_value = intent.getStringExtra("task_point");
        final TextView point_actual = (TextView) findViewById(R.id.textView_task_point_actual);
        point_actual.setText(task_point_value);

        final Button button_dishes = (Button) findViewById(R.id.button_confirm);
        final EditText comment = (EditText) findViewById(R.id.editText_comment);
        final Spinner task_time = (Spinner) findViewById(R.id.spinner_time);
        button_dishes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent myIntent = new Intent(CheckInTaskActivity.this, MainActivity.class);
                myIntent.putExtra("confirm_message", "I have done " + task_title.getText() + " " + task_time.getSelectedItem().toString());
                myIntent.putExtra("task_point", "I have earned " + point_actual.getText() + " points");
                myIntent.putExtra("comment", "My comment about the task is: " + comment.getText());
                CheckInTaskActivity.this.startActivity(myIntent);
            }
        });

        final Button button_plus = (Button) findViewById(R.id.button_plus);
        button_plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                point_actual.setText(String.valueOf(Integer.parseInt(point_actual.getText().toString()) + 1));
            }
        });
        final Button button_minus = (Button) findViewById(R.id.button_minus);
        button_minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                point_actual.setText(String.valueOf(Integer.parseInt(point_actual.getText().toString()) - 1));
            }
        });

    }
}
