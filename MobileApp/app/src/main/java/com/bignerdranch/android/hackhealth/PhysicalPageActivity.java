package com.bignerdranch.android.hackhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class PhysicalPageActivity extends AppCompatActivity {

    private SeekBar mSeekBar;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_page);
        setTitle("Health Pal");

        mSeekBar = (SeekBar) findViewById(R.id.seekBar);
        mTextView = (TextView) findViewById(R.id.seekBarText);

        mTextView.setText(mSeekBar.getProgress() + "/" + mSeekBar.getMax());

        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override

            public void onStopTrackingTouch(SeekBar seekBar) {

                mTextView.setText(progress + "/" + seekBar.getMax());


            }
        });
    }
}
