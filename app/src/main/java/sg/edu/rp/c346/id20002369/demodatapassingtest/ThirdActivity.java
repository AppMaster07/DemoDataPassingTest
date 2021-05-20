package sg.edu.rp.c346.id20002369.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvShow = findViewById(R.id.textViewShow2);

        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("charVal", 'a');
        tvShow.setText("Char value received is: " + value);

    }
}