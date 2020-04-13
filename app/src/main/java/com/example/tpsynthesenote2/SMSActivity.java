package com.example.tpsynthesenote2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class SMSActivity extends AppCompatActivity {

    EditText edNum;
    EditText edText;
    Button btnSMS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_m_s);

        edNum=(EditText)findViewById(R.id.edNum);
        edText=(EditText)findViewById(R.id.edText);
        btnSMS=(Button)findViewById(R.id.btnSMS);
        
        btnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Intent intent = new Intent(Intent.ACTION_VIEW);
// intent.putExtra("sms_body",edText.getText().toString());
// intent.putExtra("address",edNum.getText().toString());
// intent.setType("vnd.android-dir/mms-sms");
// startActivity(intent);
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:" + Uri.encode(edNum.getText().toString())));
                intent.putExtra("sms_body",edText.getText().toString());
// intent.putExtra("address",edNum.getText().toString());
                startActivity(intent);
            }
        });
    }
}