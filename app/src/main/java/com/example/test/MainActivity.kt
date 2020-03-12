package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    var counter:Int=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(fragment1())
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
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment).commit()
    }
    private fun newAct() {
            val intent = Intent();
            intent.setClass(this, LauncherActivity::class.java)
            startActivity(intent)
    }

}