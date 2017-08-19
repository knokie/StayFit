package com.kellyng.stayfit.stayfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HospitalActivity extends AppCompatActivity {

    private Button btScan;
    private EditText etPatientID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital_activity);

        btScan = (Button) findViewById(R.id.ScanButton);
        etPatientID = (EditText) findViewById(R.id.PatientID);

        btScan.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (etPatientID.length() == 0)
                {
                    Toast.makeText(HospitalActivity.this, "Please scan a patient wristband barcode!", Toast.LENGTH_SHORT).show();
                }
                else
                {

                }
            }
        });
    }
}
