package com.sample.android_sample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Process
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sample.android_sample.SampleActivity.Companion.startActivityHome
import com.sample.android_sample.SampleFragmentActivity.Companion.startFragmentActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        printLog(""+isTaskRoot)
        val id = Process.myPid()
        printLog(""+id)
        printLog("task "+taskId)
        printLog("onCreate")
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.btn_main)?.setOnClickListener {
            startActivityHome(this)
        }

        findViewById<View>(R.id.btn_fragment)?.setOnClickListener {
            startFragmentActivity(this)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        printLog("onNewIntent")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        printLog("onSaveInstanceState")
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        printLog("onRestoreInstanceState")
    }
    override fun onStart() {
        super.onStart()
        printLog("onStart")
    }

    override fun onResume() {
        super.onResume()
        printLog("onResume")
    }

    override fun onPause() {
        super.onPause()
        printLog("onPause")
    }

    override fun onStop() {
        super.onStop()
        printLog("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        printLog("onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        printLog("onRestart")
    }
    fun printLog(msg:String){
        Log.v("SampleLog",msg)
    }

    companion object{
        fun startActivityMain(con: Context){
            val inte= Intent(con, MainActivity::class.java)
            con?.startActivity(inte)
        }
    }
}