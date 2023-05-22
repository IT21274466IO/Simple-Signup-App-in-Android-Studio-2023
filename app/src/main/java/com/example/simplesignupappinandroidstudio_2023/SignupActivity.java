package com.example.simplesignupappinandroidstudio_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
    private Button signupBtn;
    private EditText nameEdt,emailEdt, passEdt, rePassEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setVariable();
    }

    private void setVariable() {
        signupBtn.setOnClickListener(v -> {
            if(nameEdt.getText().toString().trim().isEmpty() || emailEdt.getText().toString().trim().isEmpty()
                    || passEdt.getText().toString().trim().isEmpty() || rePassEdt.getText().toString().trim().isEmpty()) {
                Toast.makeText(SignupActivity.this, "Please Fill the Signup Form", Toast.LENGTH_SHORT).show();
            } else if (!passEdt.getText().toString().trim().equals(rePassEdt.getText().toString().trim())) {
                Toast.makeText(SignupActivity.this, "Your Password is not matching", Toast.LENGTH_SHORT).show();
            } else {
                startActivity(new Intent(SignupActivity.this, MainActivity.class));
            }
        });
    }

    private void initView() {
        signupBtn = findViewById(R.id.button);
        nameEdt = findViewById(R.id.editTextTextPersonName);
        emailEdt = findViewById(R.id.editTextTextEmail);
        passEdt = findViewById(R.id.editTextTextPassword);
        rePassEdt = findViewById(R.id.editTextRePassword);
    }
}