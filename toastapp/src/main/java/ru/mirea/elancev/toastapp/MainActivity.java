package ru.mirea.elancev.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btClick(View view) {
        EditText editText = findViewById(R.id.textEdit);
        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ №5 ГРУППА БСБО-02-20 Количество символов - " + editText.getText().length(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}