package com.example.eziam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    TextInputLayout fullName, idNumber, phoneNumber, tenantName, houseNumber,timeIn;
    Button saveBtn;

    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullName = findViewById(R.id.full_name);
        idNumber = findViewById(R.id.id_number);
        phoneNumber = findViewById(R.id.phone_number);
        tenantName = findViewById(R.id.tenant_name);
        houseNumber = findViewById(R.id.house_number);
        timeIn = findViewById(R.id.time_in);
        saveBtn = findViewById(R.id.save_btn);

        //save data to Firebase
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                database = FirebaseDatabase.getInstance();
                reference = database.getReference("Users");

                //get all values
                String name = fullName.getEditText().getText().toString();
                String idNo = idNumber.getEditText().getText().toString();
                String phoneNo = phoneNumber.getEditText().getText().toString();
                String tenantN = tenantName.getEditText().getText().toString();
                String houseNo = houseNumber.getEditText().getText().toString();
                String time = timeIn.getEditText().getText().toString();

                if (TextUtils.isEmpty(name) || TextUtils.isEmpty(idNo) || TextUtils.isEmpty(phoneNo)
                        || TextUtils.isEmpty(tenantN) || TextUtils.isEmpty(houseNo) || TextUtils.isEmpty(time)){

                    Toast.makeText(MainActivity.this, "PLease fill in all the Details", Toast.LENGTH_SHORT).show();
                }
                else {
                    UserHelperClass helperClass = new UserHelperClass(name, idNo, phoneNo, tenantN, houseNo, time);
                    reference.child(tenantN).setValue(helperClass);
                    Toast.makeText(MainActivity.this, "Visitor profile was setup successfully", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
