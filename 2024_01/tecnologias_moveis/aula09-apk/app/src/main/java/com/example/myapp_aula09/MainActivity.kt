package com.example.myapp_aula09

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.myapp_aula09.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        val toolbar = binding.toolbar
        val bottomMenu = binding.menuBottom

        val navController = Navigation.findNavController(this, R.id.navHostFragment)
        NavigationUI.setupWithNavController(bottomMenu, navController)

        setSupportActionBar(toolbar)

        supportActionBar?.apply {
            this.title = "Fruteira"
            setDisplayHomeAsUpEnabled(false)
        }
    }
}
