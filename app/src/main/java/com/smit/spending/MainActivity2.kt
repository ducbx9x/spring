package com.smit.spending

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.gms.auth.api.signin.GoogleSignInAccount

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val account = intent.getSerializableExtra("acc")!! as GoogleSignInAccount
        findViewById<TextView>(R.id.tv).text = "Đã đăng nhập với email: " + account.email
    }
}