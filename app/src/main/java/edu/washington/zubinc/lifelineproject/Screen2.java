package edu.washington.zubinc.lifelineproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen2 extends AppCompatActivity {

    Button option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        this.option = (Button)findViewById(R.id.o2);
        this.option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen2.this, Screen3.class);
                startActivity(intent);
            }
        });

    }
}
