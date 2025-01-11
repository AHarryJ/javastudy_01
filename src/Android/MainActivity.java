package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btnAddClicked(View view) {
        EditText editNum1 = findViewById(R.id.activity_main__editTextNum1);
        EditText editNum2 = findViewById(R.id.activity_main__editTextNum2);
        TextView textresult = findViewById(R.id.activity_main__TextResult);



        editNum1.setText(editNum1.getText().toString().trim());
        if (editNum1.getText().length() == 0) {
            toastMsg("숫자1를 입력해주세요");
            editNum1.requestFocus();
            return;
        }

        editNum2.setText(editNum2.getText().toString().trim());
        if (editNum2.getText().length() == 0) {
            toastMsg("숫자2를 입력해주세요");
            editNum2.requestFocus();
            return;
        }

        int num1 = Integer.parseInt(editNum1.getText().toString());
        int num2 = Integer.parseInt(editNum2.getText().toString());

        int res = num1 + num2;
        //toastMsg("결과 : " + res);
        textresult.setText("결과 : "+res);

    }

    public void btnAddClickedClear(View view) {
        EditText editNum1 = findViewById(R.id.activity_main__editTextNum1);
        EditText editNum2 = findViewById(R.id.activity_main__editTextNum2);
        TextView textresult = findViewById(R.id.activity_main__TextResult);


        editNum1.setText("");
        editNum2.setText("");
        textresult.setText("");
    }

    void toastMsg(String msg) {
        Toast.makeText(getApplicationContext(), "결과 : " + msg, Toast.LENGTH_SHORT).show();
    }
}