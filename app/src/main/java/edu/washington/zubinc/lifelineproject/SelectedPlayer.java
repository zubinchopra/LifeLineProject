package edu.washington.zubinc.lifelineproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectedPlayer extends AppCompatActivity {

    Button screen1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_player);

        this.screen1 = (Button)findViewById(R.id.say_no);
        this.screen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectedPlayer.this, Screen1.class);
                startActivity(intent);
            }
        });

    }
}
