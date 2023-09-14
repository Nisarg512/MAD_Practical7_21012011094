package com.example.mad_practical7_21012011094

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val youtubeId = "fJn9B64Znrk"
        val yoututubeWebView: WebView = findViewById(R.id.webview)
        val webSettings: WebSettings = yoututubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        yoututubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")
        val button = findViewById<FloatingActionButton>(R.id.floatingActionButton2)
        button.setOnClickListener {
            Intent(this, MainActivity::class.java).apply { startActivity(this) }
        }
    }
}