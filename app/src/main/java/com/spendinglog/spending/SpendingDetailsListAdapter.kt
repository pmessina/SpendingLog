package com.spendinglog.spending

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter


class SpendingDetailsListAdapter(context:Context) : BaseAdapter(), StickyListHeadersAdapter
{
    private lateinit var inflater: LayoutInflater

    init {
        inflater = LayoutInflater.from(context)
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val vi = inflater.inflate(R.layout.activity_spending_details_child_view, parent, false)
        val tvAmount = vi.findViewById(R.id.tvAmount) as TextView
        val tvPaymentType = vi.findViewById(R.id.tvPaymentType) as TextView
        val tvNotes = vi.findViewById(R.id.tvNotes) as TextView
        tvAmount.text = "$10.00"
        tvPaymentType.text = "Credit Card"
        tvNotes.text = "Bill Payments"


        return vi
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return 1
    }

    override fun getHeaderId(position: Int): Long {
        return position.toLong()
    }

    override fun getHeaderView(position: Int, convertView: View?, parent: ViewGroup?): View
    {
        val vi = inflater.inflate(R.layout.activity_spending_details_header_view, parent, false)
        val tvHeaderDate = vi.findViewById(R.id.tvHeaderDate) as TextView
        tvHeaderDate.text = "1/21/18"

        return vi
    }
}