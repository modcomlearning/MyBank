package com.modcom.mybank_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //we create listeners for out buttons
        equity.setOnClickListener{
            //after equity is clicked , we intent/move to Equity activity
            val x = Intent(applicationContext, Equity::class.java)
            startActivity(x)
        }


        family.setOnClickListener{
            val x = Intent(applicationContext, Family::class.java)
            startActivity(x)
        }


        absa.setOnClickListener{
            val x = Intent(applicationContext, Absa::class.java)
            startActivity(x)
        }


        stanbic.setOnClickListener{
             // no page/activity created
            val y = Intent(applicationContext, Stanbic::class.java)
            startActivity(y)
        }



        kcb.setOnClickListener{
            val x = Intent(applicationContext, Kcb::class.java)
            startActivity(x)
        }

        //How do we create a new page/activity/ scree for equity
        //Right Click on app - New - Activity - Empty Activity


    }
}