package com.modcom.mybank_intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_equity.*

class Equity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equity)

        //code here for equity bank

        eq_deposit.setOnClickListener{
            //intent to deposit activity
            Toast.makeText(applicationContext, "Welcome To deposits", Toast.LENGTH_LONG).show()
        }


        eq_withdraw.setOnClickListener{
            Toast.makeText(applicationContext, "Welcome To Withdraws", Toast.LENGTH_LONG).show()
        }

        eq_loans.setOnClickListener{
            Toast.makeText(applicationContext, "Welcome To Loans", Toast.LENGTH_LONG).show()
        }

        eq_sme.setOnClickListener{
            Toast.makeText(applicationContext, "Welcome To SMES", Toast.LENGTH_LONG).show()
        }
    }
}