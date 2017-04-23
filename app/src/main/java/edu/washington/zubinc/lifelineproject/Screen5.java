package edu.washington.zubinc.lifelineproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen5 extends AppCompatActivity {

    Button option1;
    Button option2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);

        this.option1 = (Button)findViewById(R.id.lo1);
        this.option2 = (Button)findViewById(R.id.lo2);

        this.option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen5.this, MainActivity.class);
                startActivity(intent);
            }
        });

        this.option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen5.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
