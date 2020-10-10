package com.example.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var score_a=0
    var score_b=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        teamA_inc_3.setOnClickListener{
            score_a+=3
            teamA_score.text="$score_a"
        }
        teamA_inc_5.setOnClickListener{
            score_a+=5
            teamA_score.text="$score_a"
        }
        teamB_inc_3.setOnClickListener{
            score_b+=3
            teamB_score.text="$score_b"
        }
        teamB_inc_5.setOnClickListener{
            score_b+=3
            teamB_score.text="$score_b"
        }
        teamA_free.setOnClickListener{
            score_a+=1
            teamA_score.text="$score_a"
        }
        teamB_free.setOnClickListener{
            score_b+=1
            teamB_score.text="$score_b"
        }
        reset_btn.setOnClickListener{
            score_a=0
            score_b=0;
            teamA_score.text="$score_a"
            teamB_score.text="$score_b"
        }
    }
}
