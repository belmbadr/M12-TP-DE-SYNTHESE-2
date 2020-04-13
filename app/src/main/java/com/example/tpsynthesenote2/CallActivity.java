package com.example.tpsynthesenote2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class CallActivity extends AppCompatActivity {

    EditText edNum;
    Button btnCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        edNum=(EditText)findViewById(R.id.edNum);
        btnCall=(Button)findViewById(R.id.btnCall);
        
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri call = Uri.parse("tel:"+edNum.getText().toString());
                Intent intent = new Intent(Intent.ACTION_DIAL, call);
                startActivity(intent);
            }
        });
    }
}