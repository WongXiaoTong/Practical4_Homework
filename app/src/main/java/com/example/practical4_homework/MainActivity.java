package com.example.practical4_homework;

import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void initializeUI() {
        View chocolate_syrup = findViewById(R.id.chocolate_syrup);
        View sprinkles = findViewById(R.id.sprinkles);
        View orio_cookies = findViewById(R.id.orio);
        View cherries = findViewById(R.id.cherries);
        View crushed_nuts = findViewById(R.id.crushed_nuts);
    }

    public void onShowToastClicked(View view) {
        String message = "Toppings: ";

        Checkable chocolate_syrup = null;
        if (chocolate_syrup.isChecked())
            message += getString(R.string.chocolate_syrup) + " ";

        Checkable sprinkles = null;
        if (sprinkles.isChecked())
            message += getString(R.string.sprinkles) + " ";

        Checkable crushed_nuts = null;
        if (crushed_nuts.isChecked())
            message += getString(R.string.crushed_nuts) + " ";

        Checkable cherries = null;
        if (cherries.isChecked())
            message += getString(R.string.cherries) + " ";

        Checkable orio = null;
        if (orio.isChecked())
            message += getString(R.string.orio_cookie) + " ";

        displayToast(message);

    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
}
