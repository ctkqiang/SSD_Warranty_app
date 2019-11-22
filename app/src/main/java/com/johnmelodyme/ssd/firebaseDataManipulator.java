package com.johnmelodyme.ssd;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class firebaseDataManipulator {
    private FirebaseDatabase ssd_database;
    private DatabaseReference ssdREF;
    private List<Data> SSD_DATA = new ArrayList<>();

    public interface DataStatus{
        void DataIsLoaded(List<Data>SSD_DATA, List<String>keys);
        void DataIsInserted();
        void DataIsUpdated();
        void DataIsDeleted();
    }

    public firebaseDataManipulator() {
        ssd_database = FirebaseDatabase.getInstance();
        ssdREF = ssd_database.getReference("SSD_DATA");
    }

    public void readData(final DataStatus dataStatus){
        ssdREF.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                SSD_DATA.clear();
                List<String> keys = new ArrayList<>();
                for (DataSnapshot keyNode : dataSnapshot.getChildren()){
                    keys.add(keyNode.getKey());
                    Data data = keyNode.getValue(Data.class);
                    SSD_DATA.add(data);
                }
                dataStatus.DataIsLoaded(SSD_DATA,keys);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


    public void addData(Data ssd_data, final DataStatus dataStatus){
        String key = ssdREF.push().getKey();
        ssdREF.child(key).setValue(ssd_data)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        dataStatus.DataIsInserted();
                    }
                });
    }

}
