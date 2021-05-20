package sg.edu.rp.c346.id20002369.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvShow = findViewById(R.id.textViewShow3);

        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("doVal", 1.0);
        tvShow.setText("Double value received is: " + value);
    }
}