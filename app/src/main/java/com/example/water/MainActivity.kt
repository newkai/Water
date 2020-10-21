package com.example.water

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebSettings
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webview = findViewById(R.id.webview) as WebView
        val webSettings = webview.settings
        webSettings.javaScriptEnabled = true
        setContentView(webview)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://umap.openstreetmap.fr/zh-tw/map/map_512218#11/23.1666/120.2934")
    }
}