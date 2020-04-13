package com.example.tpsynthesenote2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
public class WebActivity extends AppCompatActivity {

    WebView wv;
    Button btnWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wv=(WebView)findViewById(R.id.wv);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("http://google.fr/");

        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);

        btnWeb=(Button)findViewById(R.id.btnWeb);
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p1 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(p1);
            }
        });
    }
}