package com.spendinglog.spending

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_spending.*
import java.util.*

class SpendingActivity : AppCompatActivity(), TextWatcher {
    override fun afterTextChanged(s: Editable?)
    {
        Toast.makeText(this, s.toString(), Toast.LENGTH_LONG).show()
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
       
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spending)

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        edtDate.setText("${month + 1 }/$day/$year")

        edtDate.setOnClickListener {
            val fragment = SpendingDialogFragment()
            fragment.show(supportFragmentManager, "DIALOG")

        }
        edtAmount.addTextChangedListener(this)

//        edtAmount.addTextChangedListener(object: TextWatcher{
//            override fun afterTextChanged(s: Editable?) {
//                val str = s.toString()
//
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//
//            }
//
//        })

        btnSubmit.setOnClickListener{
            val intent = Intent(this, SpendingDetailsActivity::class.java)
            startActivity(intent)
        }
    }
}

