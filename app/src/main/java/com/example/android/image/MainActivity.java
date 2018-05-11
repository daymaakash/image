package com.example.android.image;



import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.akashdayma.image.R;

/**
 * This app displays an order form to order coffee.
 */
@SuppressLint("Registered")
class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(1);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView text_View = findViewById(R.id.text_View);
        text_View.setText("" + number);
    }
}