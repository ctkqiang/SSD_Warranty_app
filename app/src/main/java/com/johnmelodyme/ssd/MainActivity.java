package com.johnmelodyme.ssd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView RV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RV =  findViewById(R.id.recyclerview);
        new firebaseDataManipulator().readData(new firebaseDataManipulator.DataStatus() {
            @Override
            public void DataIsLoaded(List<Data> SSD_DATA, List<String> keys) {
                new recyclerview_config().setConfig(RV, MainActivity.this,
                        SSD_DATA, keys);
            }

            @Override
            public void DataIsInserted() {

            }

            @Override
            public void DataIsUpdated() {

            }

            @Override
            public void DataIsDeleted() {

            }
        });
    }

}
