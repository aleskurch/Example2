package com.example.test

import android.content.res.Configuration
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.fragment4_fragment.*


class fragment4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment4_fragment, container, false)
        view.findViewById<RadioGroup>(R.id.radio2).setOnCheckedChangeListener(::onCheck)
        return view
    }
    private fun onCheck(group: RadioGroup, checkedId: Int){
        when(checkedId){
            R.id.Small->Toast.makeText(context, "6",Toast.LENGTH_SHORT).show()
            R.id.Big-> Toast.makeText(context, "10",Toast.LENGTH_SHORT).show()
        }
    }
}
