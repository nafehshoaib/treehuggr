package io.treehugger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DonateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://nafehshoaib.github.io/treehuggr");
    }
}
