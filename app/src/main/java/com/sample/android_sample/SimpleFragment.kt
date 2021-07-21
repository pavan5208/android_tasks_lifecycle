package com.sample.android_sample

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SimpleFragment:Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        printLog("onCreate")

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        printLog("onCreateView")
        val view =  inflater.inflate(R.layout.fragment_sample, container, false)
        view.findViewById<View>(R.id.button_fragment)?.setOnClickListener {
           (activity as SampleFragmentActivity).loadFragment(SimpleFragmentTwo())
        }
        return view
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        printLog("onAttach")
    }

    override fun onDetach() {
        super.onDetach()
        printLog("onDetach")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        printLog("onDestroyView")
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        printLog("onViewCreated")

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        printLog("onActivityCreated")
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        printLog("onSaveInstanceState")
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


    fun printLog(msg:String){
        Log.v("SampleLog", "$msg fragment")
    }

}