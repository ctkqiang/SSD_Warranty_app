package com.johnmelodyme.ssd;
/*  BRAINTECH PRIVATE LIMITED :: JOHN MELODY MELISSA
 *  https://github.com/johnmelodyme
 * https://ssdwarranty-8a6bc.firebaseio.com/
 */
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    // Declaration
    Data data;
    CheckBox terms;
    TextView thefuckingdate;
    TextView termla;
    EditText serial_number;
    EditText client_name;
    EditText client_phone_number;
    EditText motherfucking_agent_name;
    EditText motherfucking_agent_phone_number;
    EditText theMotherFuckingLastMinuteAddOn_socalled_purchase_date;
    Button button_save_to_database_that_people_underestimate_about;
    FirebaseDatabase the_fucking_server_database;
    DatabaseReference whatever_shitDATA_reference;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // THE_FUCKING_PHONE_DATE_REAL_TIME ::
        thefuckingdate = findViewById(R.id.fuckingdate);
        String phonedate = DateFormat.getDateTimeInstance()
                .format(new Date());
        thefuckingdate.setText(phonedate);

        // ELABORATION :
        terms = findViewById(R.id.checkboxla);
        termla = findViewById(R.id.termla);
        the_fucking_server_database = FirebaseDatabase.getInstance();
        whatever_shitDATA_reference = FirebaseDatabase.getInstance()
                .getReference("SSD_DATA");

        serial_number = findViewById(R.id.productSerialNumber);
        client_name = findViewById(R.id.clientName);
        client_phone_number = findViewById(R.id.clientPhone);
        motherfucking_agent_name = findViewById(R.id.fuckingagentname);
        motherfucking_agent_phone_number = findViewById(R.id.agentPhone);
        theMotherFuckingLastMinuteAddOn_socalled_purchase_date = findViewById(R.id.purchasedate);
        button_save_to_database_that_people_underestimate_about = findViewById(R.id.button_Save_toDataBase);
        button_save_to_database_that_people_underestimate_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if (!TextUtils.isEmpty(serial_number, client_name, client_phone_number, motherfucking_agent_name, motherfucking_agent_phone_number, theMotherFuckingLastMinuteAddOn_socalled_purchase_date)) { }

                Data data;
                data = new Data();
                data.setProductsserialnumber(serial_number.getText().toString());
                data.setClientname(client_name.getText().toString());
                data.setClientphonenumber(client_phone_number.getText().toString());
                data.setAgentname(motherfucking_agent_name.getText().toString());
                data.setAgentphonenumber(motherfucking_agent_phone_number.getText().toString());
                data.setPurchasedate(theMotherFuckingLastMinuteAddOn_socalled_purchase_date.getText().toString());

                new firebaseDataManipulator().addData(data, new firebaseDataManipulator.DataStatus() {
                    @Override
                    public void DataIsLoaded(List<Data> SSD_DATA, List<String> keys) {

                    }

                    @Override
                    public void DataIsInserted() {
                        String Isrt;
                        Isrt = "Done";
                        Toast.makeText(getApplicationContext(), Isrt,
                                Toast.LENGTH_SHORT)
                                .show();
                    }

                    @Override
                    public void DataIsUpdated() {

                    }

                    @Override
                    public void DataIsDeleted() {

                    }
                });

            }
            @NonNull
            public String checkNotEmpty(@Nullable String string) {
                if (TextUtils.isEmpty(string)) {
                    throw new IllegalArgumentException("Must not be null or empty");
                }
                return string;
            }
        });

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!((CheckBox) v).isChecked()){
                    String pleaseclickthecheckboxotherwisetheemployerhereisgoingtokillme;
                    pleaseclickthecheckboxotherwisetheemployerhereisgoingtokillme = "Warranty will be Void Unless Accept the Term and Condition";
                    Toast.makeText(getApplicationContext(),
                            pleaseclickthecheckboxotherwisetheemployerhereisgoingtokillme
                            , Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });

        termla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTERMS = new Intent(MainActivity.this, termsandconditionlawhateverla.class);
                startActivity(toTERMS);
                finish();
            }
        });
    }


    @Override
    public void onBackPressed(){
        String msg;
        msg = "Thanks for Registering!";
        Toast.makeText(getApplicationContext(),
                msg,
                Toast.LENGTH_SHORT)
                .show();
        finish();
    }
}
