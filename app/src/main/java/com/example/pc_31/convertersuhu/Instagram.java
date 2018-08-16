package com.example.pc_31.convertersuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView; // memasukan class WebView
import android.webkit.WebViewClient; //memasukan class WebViewClient
public class Instagram extends AppCompatActivity {
    private WebView view; //membuat variabel view agar bisa akses method

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        view = (WebView) this.findViewById(R.id.webviewig);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyBrowser());
        view.loadUrl("https://www.instagram.com/nurfadilah125/");
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
