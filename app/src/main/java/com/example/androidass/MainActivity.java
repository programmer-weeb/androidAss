package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private Button addButton;
    private Button subtractButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = findViewById(R.id.firstNumber);
        secondNumberEditText = findViewById(R.id.secondNumber);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());
                int result = firstNumber + secondNumber;

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());
                int result = firstNumber - secondNumber;

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }
}
