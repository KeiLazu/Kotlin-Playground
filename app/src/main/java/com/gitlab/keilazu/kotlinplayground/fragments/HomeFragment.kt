package com.gitlab.keilazu.kotlinplayground.fragments


import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import carbon.widget.Button

import com.gitlab.keilazu.kotlinplayground.R
import com.gitlab.keilazu.kotlinplayground.interfaces.IHeader

class HomeFragment : Fragment(), IHeader {

    lateinit var v: View

    override lateinit var btnNext: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_home, container, false)

        HeaderInit()

        return v;
    }

    override fun HeaderInit() {
        btnNext = v.findViewById(R.id.include_header_btn_next)
        HeaderScript()
    }

    override fun HeaderScript() {
        btnNext.setOnClickListener(View.OnClickListener {v ->
            Toast.makeText(context, "Next page", Toast.LENGTH_SHORT).show()
        })

    }

}
