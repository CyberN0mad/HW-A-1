package com.example.hw_a_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etText;
    private Button btnSignIn;
    private Button btnRegister;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        etText = findViewById(R.id.etText);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnRegister = findViewById(R.id.btnRegister);

        btnSignIn.setOnClickListener(view -> Check());


    }

    public void Check() {
        if (etText.getText().toString().trim().length() <= 8) {

            if (!etText.getText().toString().trim().isEmpty())
                Toast.makeText(this, "Успешно!", Toast.LENGTH_SHORT).show();


        } else {
            etText.setError("Не больше 8 символов.");
            Toast.makeText(this, "Ошибка!", Toast.LENGTH_SHORT).show();
        }


    }
}