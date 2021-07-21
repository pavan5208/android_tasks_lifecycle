package com.sample.android_sample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Process
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sample.android_sample.MainActivity.Companion.startActivityMain

class SampleActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        printLog("onCreate")

        setContentView(R.layout.activity_sample)
        findViewById<View>(R.id.textView)?.setOnClickListener {
            startActivityMain(this)
        }
        printLog(""+isTaskRoot)


    }

    override fun onStart() {
        super.onStart()
        printLog("onStart")
    }

    override fun onResume() {
        super.onResume()
        val id = Process.myPid()
        printLog(""+id)
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
        Log.v("SampleLog",msg+2)
    }


    companion object{
        fun startActivityHome(con:Context){
            val inte= Intent(con, SampleActivity::class.java)
            con?.startActivity(inte)
        }
    }

}