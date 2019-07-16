package com.example.alcchallenge;

import android.net.http.SslError;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {
    private WebView webview_About;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        webview_About = (WebView) findViewById(R.id.webview_about);
        webview_About.setWebViewClient(new WebViewClient()); // to load within the app
        webview_About.loadUrl("https://andela.com/alc/");


        WebSettings webSettings =webview_About.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }


    @Override
    public void onBackPressed() {
        if (webview_About.canGoBack()){
            webview_About.goBack();

        } else {
            super.onBackPressed();
        }


    }


}
