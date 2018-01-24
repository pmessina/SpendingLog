package com.spendinglog.spending

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_spending.*
import kotlinx.android.synthetic.main.activity_spending_details.*

class SpendingDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spending_details)




        val spendingDetailsListAdapter = SpendingDetailsListAdapter(this)
        list.adapter = spendingDetailsListAdapter

    }
}
