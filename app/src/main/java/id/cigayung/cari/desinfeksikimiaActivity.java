package id.cigayung.cari;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class desinfeksikimiaActivity extends AppCompatActivity {

    WebView webviewdesinfeksikimia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desinfeksikimia);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewdesinfeksikimia =(WebView) findViewById(R.id.webviewdesinfeksikimia);
        webviewdesinfeksikimia.getSettings().setBuiltInZoomControls(true);
        webviewdesinfeksikimia.loadUrl("file:///android_asset/desinfeksikimia.html");

        WebSettings webSettings = webviewdesinfeksikimia.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}