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

        var btZerar = btZerar;
        btZerar.setOnClickListener{zerar()};
    }

    fun moreA()
    {
        if(pontA < 12)
        {
            pontA = pontA + 1;
            var tvTA = tvTimeA;
            tvTA.text = pontA.toString();
        }
    }

    fun moreB()
    {
        if (pontB < 12) {
            pontB = pontB + 1;
            var tvTB = tvTimeB;
            tvTB.text = pontB.toString();
        }
    }

    fun minusA()
    {
        if(pontA > 0)
        {
            pontA = pontA - 1;
            tvTimeA.text = pontA.toString();
        }
    }

    fun minusB()
    {
        if(pontB > 0)
        {
            pontB = pontB - 1;
            tvTimeB.text = pontB.toString();
        }
    }

    fun zerar()
    {
        pontA = 0;
        pontB = 0;

        tvTimeA.text = pontA.toString();

        tvTimeB.text = pontB.toString();
    }
}
