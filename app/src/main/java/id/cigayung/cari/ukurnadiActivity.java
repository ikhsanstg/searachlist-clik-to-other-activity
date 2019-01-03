package id.cigayung.cari;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ukurnadiActivity extends AppCompatActivity {
    WebView webviewnadi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ukurnadi);



        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnadi =(WebView) findViewById(R.id.webviewnadi);
        webviewnadi.getSettings().setBuiltInZoomControls(true);
        webviewnadi.loadUrl("file:///android_asset/nadi.html");

        WebSettings webSettings = webviewnadi.getSettings();
        webSettings.setJavaScriptEnabled(true);



    }
}

