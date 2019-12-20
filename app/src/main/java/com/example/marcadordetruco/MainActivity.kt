package com.example.marcadordetruco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    var pontA: Int = 0;
    var pontB: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvTA = tvTimeA;
        tvTA.text = pontA.toString();

        var tvTB = tvTimeB;
        tvTB.text = pontB.toString();

        var btMoreA = btMoreA;
        btMoreA.setOnClickListener{moreA()};

        var btMoreB = btMoreB;
        btMoreB.setOnClickListener{moreB()};

        var btMinusA = btMinusA;
        btMinusA.setOnClickListener{minusA()};

        var btMinusB = btMinusB;
        btMinusB.setOnClickListener{minusB()};
    }

    fun moreA()
    {
        pontA = pontA + 1;
        var tvTA = tvTimeA;
        tvTA.text = pontA.toString();
    }

    fun moreB()
    {
        pontB = pontB + 1;
        var tvTB = tvTimeB;
        tvTB.text = pontB.toString();
    }

    fun minusA()
    {
        if(pontA > 0)
        {
            pontA = pontA - 1;
            var tvTA = tvTimeA;
            tvTA.text = pontA.toString();
        }
    }

    fun minusB()
    {
        if(pontB > 0)
        {
            pontB = pontB - 1;
            var tvTB = tvTimeB;
            tvTB.text = pontB.toString();
        }
    }
}
