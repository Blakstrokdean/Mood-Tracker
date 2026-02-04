package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText moodInput;
    private Button submitButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moodInput = findViewById(R.id.moodInput);
        submitButton = findViewById(R.id.submitButton);
        resultText = findViewById(R.id.resultText);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mood = moodInput.getText().toString();
                if (!mood.isEmpty()) {
                    resultText.setText("Today's mood: " + mood);
                    moodInput.setText("");
                }
            }
        });
    }
}
