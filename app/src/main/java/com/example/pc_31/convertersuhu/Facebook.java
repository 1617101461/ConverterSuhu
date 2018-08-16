package com.example.pc_31.convertersuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView; // memasukan class WebView
import android.webkit.WebViewClient; //memasukan class WebViewClient

public class Facebook extends AppCompatActivity {
    private WebView view; //membuat variabel view agar bisa akses method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        view = (WebView) this.findViewById(R.id.webviewfb);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyBrowser());
        view.loadUrl("https://id-id.facebook.com/smkassalaam");
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
    }

        }
}
