package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayTweets()
    }

    fun displayTweets() {
        val contact1=ContactData("Cathy","07213563","cathy@gmail.com"," ")
        val contact2=ContactData("Essy","07213563","essy@gmail.com"," ")
        val contact3=ContactData("Maimy","07213563","maimy@gmail.com"," ")
        val contactList = listOf(contact1, contact2,contact3)
        val contAdapter = ContactsRvAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contAdapter
    }
}







