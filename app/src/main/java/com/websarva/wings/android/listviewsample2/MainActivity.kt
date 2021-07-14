package com.websarva.wings.android.listviewsample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        var menuList = mutableListOf("から揚げ定食","ハンバーグ定食","生姜焼き定食","ステーキ定食","野菜炒め定食","とんかつ定食","メンチカツ定食","チキンカツ定食","コロッケ定食","回鍋肉定食","麻婆豆腐定食","青椒肉絲定食","焼き魚定食","焼肉定食")
        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1,menuList)
        lvMenu.adapter = adapter
    }
}