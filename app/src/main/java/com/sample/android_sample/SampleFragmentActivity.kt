package com.sample.android_sample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Process
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction


class SampleFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        printLog("onCreate")
        loadFragment(SimpleFragment())
        val id = Process.myPid()
        printLog(""+id)
        printLog("task "+taskId)

    }
    fun loadFragment(fragment: Fragment) {
        // create a FragmentManager
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        // add the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.addToBackStack ( fragment.tag)
        fragmentTransaction.commit() // save the changes
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
        Log.v("SampleLog",msg+" fragmentActivity")
    }
    companion object{
        fun startFragmentActivity(con: Context){
            val inte= Intent(con, SampleFragmentActivity::class.java)
            con?.startActivity(inte)
        }
    }
}