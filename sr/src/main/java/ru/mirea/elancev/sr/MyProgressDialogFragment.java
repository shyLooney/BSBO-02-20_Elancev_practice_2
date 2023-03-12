package ru.mirea.elancev.sr;

import android.app.ProgressDialog;

public class MyProgressDialogFragment {
    private ProgressDialog progressDialog;
    MyProgressDialogFragment(MainActivity mainActivity)
    {
        progressDialog = new ProgressDialog(mainActivity);
    }
    public void show() {
        progressDialog.show();
    }
}
