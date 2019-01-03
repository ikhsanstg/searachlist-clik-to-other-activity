package id.cigayung.cari;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class cucitgnSterilActivity extends AppCompatActivity {

    WebView webviewcucitgnSteril;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cucitgn_steril);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewcucitgnSteril =(WebView) findViewById(R.id.webviewcucitgnSteril);
        webviewcucitgnSteril.getSettings().setBuiltInZoomControls(true);
        webviewcucitgnSteril.loadUrl("file:///android_asset/cucitgnSteril.html");

        WebSettings webSettings = webviewcucitgnSteril.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}