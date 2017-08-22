package com.kellyng.stayfit.stayfit;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

import static java.security.AccessController.getContext;


public class RecordActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_activity);

        listView = (ListView) findViewById(R.id.listview);

        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Dummy.ACTIVITIES); //android SDK layout
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.item_list, R.id.text, Dummy.ACTIVITIES);
        final ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, R.layout.item_list, R.id.text, Dummy.MEDICINES);
        listView.setAdapter(arrayAdapter);
        //listView.setAdapter(arrayAdapter2);

        final Button btNext = new Button (RecordActivity.this);
        btNext.setText("Next");
        btNext.setBackground(getResources().getDrawable(R.drawable.scanbutton));
        btNext.setTextColor(getResources().getColor(R.color.colorButtonText));
        btNext.setTypeface(null, Typeface.BOLD);

        TextView empty = new TextView(this);
        final TextView tvHeader = new TextView(this);
        float density = getResources().getDisplayMetrics().density;


        tvHeader.setText("Feeding");
        tvHeader.setTextColor(getResources().getColor(R.color.colorBlackText));
        tvHeader.setTextSize((int)(density * 12));
        tvHeader.setPadding(0,0,0,(int)(16 * density));



        int paddingPixel = 25;
        int paddingDp = (int)(paddingPixel * density);
        empty.setHeight(paddingDp);

        listView.addHeaderView(tvHeader);
        listView.addFooterView(empty);
        listView.addFooterView(btNext);

        btNext.setOnClickListener((new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (btNext.getText() == "Next")
                {
                    btNext.setText("Previous");
                    tvHeader.setText("Medicine");
                    listView.setAdapter(arrayAdapter2);
                }
                else
                {
                    tvHeader.setText("Feeding");
                    btNext.setText("Next");
                    listView.setAdapter(arrayAdapter);
                }
            }
        }));
    }
}