package edu.washington.zubinc.lifelineproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen4 extends AppCompatActivity {

    Button option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        this.option = (Button)findViewById(R.id.o4);
        this.option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen4.this, Screen5.class);
                startActivity(intent);
            }
        });

    }
}
