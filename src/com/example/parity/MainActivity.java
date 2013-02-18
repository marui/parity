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
        String value = intent.getStringExtra("confirm_message");
        final TextView confirm_message = (TextView) findViewById(R.id.textView_confirm_message);
        confirm_message.setText(value);
    }
}

