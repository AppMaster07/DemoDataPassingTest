package sg.edu.rp.c346.id20002369.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvShow = findViewById(R.id.textViewShow);

        Intent intentReceived = getIntent();
        int value1 = intentReceived.getIntExtra("value", -99);
        char value2 = intentReceived.getCharExtra("charVal", 'z');
        double value3 = intentReceived.getDoubleExtra("doVal", -99.0);

        if (value1 != -99) {
            tvShow.setText("Integer value received is: " + value1);
        } else if (value2 != 'z') {
            tvShow.setText("Character value received is: " + value2);
        } else if (value3 != -99.0) {
            tvShow.setText("Double value received is: " + value3);
        }
    }
}