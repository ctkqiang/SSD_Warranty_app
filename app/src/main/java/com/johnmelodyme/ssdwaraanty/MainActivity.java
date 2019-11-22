package com.johnmelodyme.ssdwaraanty;
/*  BRAINTECH PRIVATE LIMITED :: JOHN MELODY MELISSA
 *  https://github.com/johnmelodyme
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    // Declaration
    Data data;
    TextView thefuckingdate;
    EditText serial_number;
    EditText client_name;
    EditText client_phone_number;
    EditText purchaseDate;
    EditText motherfucking_agent_name;
    EditText motherfucking_agent_phone_number;
    TextView the_most_stupid_about_us_i_have_ever_written;
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
        the_fucking_server_database = FirebaseDatabase.getInstance(); // FIREBASE
        whatever_shitDATA_reference = FirebaseDatabase.getInstance()
                .getReference("ssdwarra"); // DATABASE
        serial_number = findViewById(R.id.producttSerialNumber);
        client_name = findViewById(R.id.clientName);
        client_phone_number = findViewById(R.id.clientPhone);
        purchaseDate = findViewById(R.id.purchaseDate);
        motherfucking_agent_name = findViewById(R.id.fuckingagentname);
        motherfucking_agent_phone_number = findViewById(R.id.agentPhone);
        the_most_stupid_about_us_i_have_ever_written = findViewById(R.id.fucking_about);
        button_save_to_database_that_people_underestimate_about = findViewById(R.id.button_Save_toDataBase);

        //============================FUNCTIONS============================================//
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //=============================[ ABOUT ]==========================================//
        the_most_stupid_about_us_i_have_ever_written.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about_page = new Intent(MainActivity.this, about.class);
                startActivity(about_page);
                finish();
            }
        });
        //==============================[CONFIG]==========================================//
        //if(TextUtils.isEmpty(serial_number.getText())){}
        button_save_to_database_that_people_underestimate_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String saving;
                String save;
                saving = "This shit will be save in Database";
                save = "Particulars Saved to Database.";
                saveThisBUllSHITTODATABASE();
                System.out.println(saving);
                Toast.makeText(getApplication(),
                        save,
                        Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }

    private void saveThisBUllSHITTODATABASE() {

        String serial_required;
        String client_name_la;
        String client_phone;
        String purchase_date;
        String agent_name;
        String agent_contact;
        String nothing_else;

        serial_required = "Please Enter The Serial Number";
        client_name_la = "Please Enter The Client's Name";
        client_phone = "Please Enter Client's Phone Number";
        purchase_date = "Please Enter Purchase Date. Format(dd/mm/yy)";
        agent_name = "Agent Name Is Required";
        agent_contact = "Agent H/P no is Required";
        nothing_else = "NOTHING ELSE";


        String serialnumber = serial_number
                .getText()
                .toString()
                .trim();

        String clientnamela = client_name
                .getText()
                .toString()
                .trim();

        String clientPhonenumberSHIT = client_phone_number
                .getText()
                .toString()
                .trim();

        String purchase = purchaseDate
                .getText()
                .toString()
                .trim();

        String agentnaaame = motherfucking_agent_name
                .getText()
                .toString()
                .trim();

        String agentphoneeee = motherfucking_agent_phone_number
                .getText()
                .toString()
                .trim();

        ////////////////////////////////////////////////////
        if(TextUtils.isEmpty(serialnumber)){
            Toast.makeText(getApplicationContext(),
                    serial_required,
                    Toast.LENGTH_SHORT)
                    .show();
        }

        if(!TextUtils.isEmpty(serialnumber)){
            uploadtofirebase();
        }
        ////////////////////////////////////////////////////
        if (TextUtils.isEmpty(clientnamela)){
            Toast.makeText(getApplicationContext(),
                    client_name_la,
                    Toast.LENGTH_SHORT)
                    .show();
        }

        if(!TextUtils.isEmpty(clientnamela)){
            uploadtofirebase();
        }

        ////////////////////////////////////////////////////
        if (TextUtils.isEmpty(clientPhonenumberSHIT)){
            Toast.makeText(getApplicationContext(),
                    client_phone,
                    Toast.LENGTH_SHORT)
                    .show();
        }

        if(!TextUtils.isEmpty(clientPhonenumberSHIT)){
            uploadtofirebase();
        }
       ////////////////////////////////////////////////////
        if(TextUtils.isEmpty(purchase)){
            Toast.makeText(getApplicationContext(),
                    purchase_date,
                    Toast.LENGTH_SHORT)
                    .show();
        }

        if(!TextUtils.isEmpty(purchase)){
            uploadtofirebase();
        }
        ////////////////////////////////////////////////////
        if(TextUtils.isEmpty(agentnaaame)){
            Toast.makeText(getApplicationContext(),
                    agent_name,
                    Toast.LENGTH_SHORT)
                    .show();
        }

        if(!TextUtils.isEmpty(agentnaaame)){
            uploadtofirebase();
        }
        ////////////////////////////////////////////////////
        if(TextUtils.isEmpty(agentphoneeee)){
            Toast.makeText(getApplicationContext(),
                    agent_contact,
                    Toast.LENGTH_SHORT)
                    .show();

       if(!TextUtils.isEmpty(agentphoneeee)){
           uploadtofirebase();
       }
       ///////////////////////////////////////////////////
        } else {
            System.out.println(nothing_else);
        }
    }


    private void uploadtofirebase() {
        Data data;
        String database = whatever_shitDATA_reference
                .push()
                .getKey();
        String serial = serial_number.getText().toString().trim();
        String clientName = client_name.getText().toString().trim();
        String clientphonenumber = client_phone_number.getText().toString().trim();
        String purchasedate = purchaseDate.getText().toString().trim();
        String agentname = motherfucking_agent_name.getText().toString().trim();
        String agentPhone = motherfucking_agent_phone_number.getText().toString().trim();


        data = new Data(serial);
        whatever_shitDATA_reference.child(database).setValue(data);
        whatever_shitDATA_reference.child("Product ID").setValue(serial);
        whatever_shitDATA_reference.child("Client Name").setValue(clientName);
        whatever_shitDATA_reference.child("Client Phone Number").setValue(clientphonenumber);
        whatever_shitDATA_reference.child("Purchase Date").setValue(purchasedate);
        whatever_shitDATA_reference.child("Agent Name").setValue(agentname);
        whatever_shitDATA_reference.child("Agent Phone Number").setValue(agentPhone);

    }
}
