package edu.washington.zubinc.lifelineproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity {

    Button option;
    Button specialoption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        this.option = (Button)findViewById(R.id.o3);
        this.specialoption = (Button)findViewById(R.id.donate);

        this.specialoption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView specialText;
                specialText = (TextView)findViewById(R.id.specialText);
                specialText.setVisibility(View.VISIBLE);
            }
        });

        this.option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen3.this, Screen4.class);
                startActivity(intent);
            }
        });

    }
}
