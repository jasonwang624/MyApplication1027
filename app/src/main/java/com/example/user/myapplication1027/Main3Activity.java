package com.example.user.myapplication1027;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class Main3Activity extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        StrictMode.VmPolicy policy = new StrictMode.VmPolicy.Builder()
                .detectFileUriExposure().build();
        StrictMode.setVmPolicy(policy);

        wv = (WebView) findViewById(R.id.webView);
        wv.setWebChromeClient(new WebChromeClient());
        wv.getSettings().setJavaScriptEnabled(true);
        //wv.loadUrl("https://tw.mobi.yahoo.com");
        wv.loadUrl("file:///android_asset/index.html");
    }

/*    @Override
    public void onBackPressed() {
        if(wv.getUrl().contains("index.heml"))
        {
            super.onBackPressed();
        }
        else
        {
            wv.goBack();
        }

    }*/
    public void click1 (View v)
    {
        Intent it = new Intent(Main3Activity.this,Main4Activity.class);
        startActivity(it);
    }
}
