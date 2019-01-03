package id.cigayung.cari;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class cucitgnActivity extends AppCompatActivity {

    WebView webviewcucitgn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cucitgn);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewcucitgn =(WebView) findViewById(R.id.webviewcucitgn);
        webviewcucitgn.getSettings().setBuiltInZoomControls(true);
        webviewcucitgn.loadUrl("file:///android_asset/cucitgn.html");

        WebSettings webSettings = webviewcucitgn.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}