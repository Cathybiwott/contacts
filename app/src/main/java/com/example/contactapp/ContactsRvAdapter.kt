package com.example.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.databinding.ContactNameListBinding

class ContactsRvAdapter(var contactData: List<ContactData>):RecyclerView.Adapter<ContactsRvAdapter.ContactsViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContactsRvAdapter.ContactsViewHolder {
        var binding=ContactNameListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
       return ContactsViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ContactsRvAdapter.ContactsViewHolder, position: Int) {
        var currentContacts=contactData.get(position)
        var binding=holder.binding
        binding.tvName.text=currentContacts.name
        binding.tvPhoneNumber.text=currentContacts.phoneNumber
        binding.tvEmailAddress.text=currentContacts.email
        binding.ivImage.tag=currentContacts.image

    }
    override fun getItemCount(): Int {
      return contactData.size
    }

class ContactsViewHolder(var binding: ContactNameListBinding):RecyclerView.ViewHolder(binding.root)

}

