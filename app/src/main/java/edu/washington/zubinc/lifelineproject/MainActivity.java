package edu.washington.zubinc.lifelineproject;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start_game;
    Button instructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.start_game = (Button)findViewById(R.id.start_game);
        this.instructions = (Button)findViewById(R.id.instructions);

        this.start_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Players.class);
                startActivity(intent);
            }
        });

        this.instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Instructions.class);
                startActivity(intent);
            }
        });
    }
}
