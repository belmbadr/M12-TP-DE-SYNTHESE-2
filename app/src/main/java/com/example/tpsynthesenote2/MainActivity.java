package com.example.tpsynthesenote2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p1 = new Intent(getApplicationContext(),CallActivity.class);
                startActivity(p1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p2 = new Intent(getApplicationContext(),SMSActivity.class);
                startActivity(p2);
            }
        });
        
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p3 = new Intent(getApplicationContext(),WebActivity.class);
                startActivity(p3);
            }
        });
    }
}
