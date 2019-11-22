package com.johnmelodyme.ssd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class termsandconditionlawhateverla extends AppCompatActivity {

    TextView termone;
    TextView termtow;
    TextView termhtree;
    Button asdfghjklsgiuvnusrhjubinjdhfiuesafojfesahvodsnvfrusrhjubinjdhfiuesafojfesahvodsnvfrusrhjubinjdhfiuesafojfesahvodsnvfr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termsandconditionlawhateverla);

        termone = findViewById(R.id.termONE);
        termtow = findViewById(R.id.termTWO);
        termhtree = findViewById(R.id.termThree);
        asdfghjklsgiuvnusrhjubinjdhfiuesafojfesahvodsnvfrusrhjubinjdhfiuesafojfesahvodsnvfrusrhjubinjdhfiuesafojfesahvodsnvfr =
                findViewById(R.id.fuckingbackbutton);




        asdfghjklsgiuvnusrhjubinjdhfiuesafojfesahvodsnvfrusrhjubinjdhfiuesafojfesahvodsnvfrusrhjubinjdhfiuesafojfesahvodsnvfr
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplication(), "Back to Main Page", Toast.LENGTH_SHORT)
                                .show();
                        Intent toMain = new Intent(termsandconditionlawhateverla.this, MainActivity.class);
                        startActivity(toMain);
                        finish();
                    }
                });

    }
    @Override
    public void onBackPressed(){
        finish();
    }
}
