      package com.kellyng.stayfit.stayfit;

      import android.content.Intent;
      import android.support.annotation.Nullable;
      import android.support.v7.app.AppCompatActivity;
      import android.os.Bundle;
      import android.widget.TextView;

      import org.w3c.dom.Text;

      import java.util.Timer;
      import java.util.TimerTask;

      public class PatientActivity extends AppCompatActivity {

          private TextView tvPatientID;
          @Override
          protected void onCreate(@Nullable Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.patient_activity);

              Intent i = getIntent();
              String strInfo = i.getStringExtra("PID");
              tvPatientID = (TextView) findViewById(R.id.StringPatientID);
              tvPatientID.setText(strInfo);
          }
      }