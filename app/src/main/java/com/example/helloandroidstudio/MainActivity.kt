package com.example.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    lateinit var navigation: BottomNavigationView;
    private val navMenu = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        when (item.itemId){
            R.id.itemFragment1 -> {
                supportFragmentManager.commit {
                    replace<FirstFragment>(R.id.frameContainer)
                    setReorderingAllowed(true);
                    addToBackStack("replacemnet");

                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemFragment2 -> {
                supportFragmentManager.commit {
                    replace<SecondFragment>(R.id.frameContainer)
                    setReorderingAllowed(true);
                    addToBackStack("replacemnet");

                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemFragment3 -> {
                supportFragmentManager.commit {
                    replace<ThirdFragment>(R.id.frameContainer)
                    setReorderingAllowed(true);
                    addToBackStack("replacemnet");

                }
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation = findViewById(R.id.nav_menu)
        navigation.setOnNavigationItemSelectedListener (navMenu)

        supportFragmentManager.commit {
            replace<FirstFragment>(R.id.frameContainer)
            setReorderingAllowed(true);
            addToBackStack("replacemnet");

        }






    }
}