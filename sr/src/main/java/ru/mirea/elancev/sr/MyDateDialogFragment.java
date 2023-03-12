package ru.mirea.elancev.sr;

import android.app.DatePickerDialog;
import android.widget.DatePicker;

import java.util.Calendar;

public class MyDateDialogFragment {
    private Calendar dateAndTime=Calendar.getInstance();
    private DatePickerDialog datePickerDialog;
    MyDateDialogFragment(MainActivity mainActivity)
    {
        datePickerDialog = new DatePickerDialog(mainActivity, d,
                dateAndTime.get(Calendar.YEAR),
                dateAndTime.get(Calendar.MONTH),
                dateAndTime.get(Calendar.DAY_OF_MONTH));
    }

    public void show()
    {
        datePickerDialog.show();
    }

    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            dateAndTime.set(Calendar.YEAR, year);
            dateAndTime.set(Calendar.MONTH, monthOfYear);
            dateAndTime.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        }
    };
}
