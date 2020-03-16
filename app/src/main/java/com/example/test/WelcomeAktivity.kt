package com.example.test

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment

private const val TAG = "MDS_TAG"
var counter:Int=1
var currentFragment: Fragment=fragment1()
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.getDefaultNightMode())
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)
        replaceFragment(currentFragment)
    }

    fun onClick (view: View) {
        when(counter){
            1->replaceFragment(fragment2())
            2->replaceFragment(fragment3())
            3->replaceFragment(fragment4())
            else ->newAct()
        }
        counter++
    }

    private fun replaceFragment(fragment: Fragment) {
        currentFragment=fragment
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment).commit()
    }
    private fun newAct() {
            val intent = Intent();
            intent.setClass(this, LauncherActivity::class.java)
            startActivity(intent)
    }
}