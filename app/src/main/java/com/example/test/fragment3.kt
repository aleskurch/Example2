package com.example.test

import android.content.res.Configuration
import android.os.AsyncTask
import android.os.Bundle
import android.os.SystemClock
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment3_fragment.*


class fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment3_fragment, container, false)
        view.findViewById<RadioGroup>(R.id.radio).setOnCheckedChangeListener(::onCheck)
        return view
    }
    private fun onCheck(group: RadioGroup, checkedId: Int){
        when(checkedId){
            R.id.Light->{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                if(resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT)
                    fragment3.setBackgroundResource(R.drawable.day)
                if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
                    fragment3.setBackgroundResource(R.drawable.dayland)
            }
            R.id.Night->{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                if(resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT)
                    fragment3.setBackgroundResource(R.drawable.night)
                if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
                    fragment3.setBackgroundResource(R.drawable.nightland)
            }
        }

    }
}
