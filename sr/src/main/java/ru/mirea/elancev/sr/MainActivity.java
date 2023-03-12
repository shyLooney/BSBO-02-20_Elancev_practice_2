package ru.mirea.elancev.sr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickTime(View view) {
        MyTimeDialogFragment myTimeDialogFragment = new MyTimeDialogFragment(this);
        myTimeDialogFragment.show();
    }

    public void clickDate(View view) {
        MyDateDialogFragment myDateDialogFragment = new MyDateDialogFragment(this);
        myDateDialogFragment.show();
    }

    public void clickProgress(View view) {
        MyProgressDialogFragment myProgressDialogFragment = new MyProgressDialogFragment(this);
        myProgressDialogFragment.show();
    }
}