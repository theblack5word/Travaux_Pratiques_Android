package com.eni.myapplication

import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.Navigation

class WhiteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_white, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textEditPrenom = view.findViewById<EditText>(R.id.editTextPrenom)

        textEditPrenom.setOnKeyListener(View.OnKeyListener { _, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                val choice = (1..2).random()
                if (choice == 1 ){
                    Navigation.findNavController(view).navigate(R.id.redFragment)
                } else {
                    Navigation.findNavController(view).navigate(R.id.pinkFragment)
                }
                return@OnKeyListener true
            }
            false
        })
    }

}