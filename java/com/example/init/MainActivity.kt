package com.example.init

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move)
        btnMoveActivity.setOnClickListener(this)

        val btnMovedataActivity: Button = findViewById(R.id.btn_move_data)
        btnMovedataActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_move->{
                val moveintent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveintent)
            }
            R.id.btn_move_data->{
                val movedataintent = Intent(this@MainActivity, MoveDataActivity::class.java)
                movedataintent.putExtra(MoveDataActivity.EXTRA_NAME, "Feni Deanof Putri")
                movedataintent.putExtra(MoveDataActivity.EXTRA_AGE, 21)
                startActivity(movedataintent)
            }
        }

    }
}