package com.johnmelodyme.ssdwaraanty;
/*  BRAINTECH PRIVATE LIMITED :: JOHN MELODY MELISSA
 *  https://github.com/johnmelodyme
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashmain extends AppCompatActivity {
    Handler this_is_a_mother_fucking_handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashmain);

        this_is_a_mother_fucking_handler = new Handler();
        this_is_a_mother_fucking_handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent goToMain = new Intent(splashmain.this, advertisement.class);
                startActivity(goToMain);
                finish();
            }
        }, 6000);
    }
}
