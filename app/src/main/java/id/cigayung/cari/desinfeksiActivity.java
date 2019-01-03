package id.cigayung.cari;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class desinfeksiActivity extends AppCompatActivity {

    WebView webviewdesinfeksi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desinfeksi);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewdesinfeksi =(WebView) findViewById(R.id.webviewdesinfeksi);
        webviewdesinfeksi.getSettings().setBuiltInZoomControls(true);
        webviewdesinfeksi.loadUrl("file:///android_asset/desinfeksi.html");

        WebSettings webSettings = webviewdesinfeksi.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}