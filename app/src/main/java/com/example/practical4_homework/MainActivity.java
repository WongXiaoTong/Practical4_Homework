package com.example.practical4_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.chocolate_syrup:
                if (checked)
                    // Same day service
                    displayToast(getString(
                            R.string.chocolate_syrup));
                break;
            case R.id.sprinkles:
                if (checked)
                    // Next day delivery
                    displayToast(getString(
                            R.string.sprinkles));
                break;
            case R.id.crushed_nuts:
                if (checked)
                    // Pick up
                    displayToast(getString(
                            R.string.crushed_nuts));
                break;
            case R.id.cherries:
                if (checked)
                    // Pick up
                    displayToast(getString(
                            R.string.cherries));
                break;
            case R.id.orio:
                if (checked)
                    // Pick up
                    displayToast(getString(
                            R.string.orio_cookie));
                break;
            default:
                // Do nothing.
                break;
        }
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
}
