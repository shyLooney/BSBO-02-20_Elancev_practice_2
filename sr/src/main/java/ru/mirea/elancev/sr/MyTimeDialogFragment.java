package ru.mirea.elancev.sr;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.widget.TimePicker;

import java.util.Calendar;

public class MyTimeDialogFragment {
    private TimePickerDialog timePickerDialog;
    private Calendar dateAndTime=Calendar.getInstance();
    public MyTimeDialogFragment(MainActivity mainActivity)
    {
        timePickerDialog = new TimePickerDialog(mainActivity ,t ,
                dateAndTime.get(Calendar.HOUR_OF_DAY),
                dateAndTime.get(Calendar.MINUTE), true);
    }
    public void show()
    {
        timePickerDialog.show();
    }

    TimePickerDialog.OnTimeSetListener t = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            dateAndTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
            dateAndTime.set(Calendar.MINUTE, minute);
        }
    };
}
