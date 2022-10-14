package com.example.aplikasigithubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserProfile : AppCompatActivity() {
    companion object{
        const val EXTRA_DATA = "extra_user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)
        val imgPhoto: CircleImageView = findViewById(R.id.item_photo)
        val tvUserName: TextView =findViewById(R.id.item_username)
        val tvName: TextView = findViewById(R.id.item_name)
        val tvLocation: TextView = findViewById(R.id.item_location)
        val tvCompany: TextView = findViewById(R.id.item_company)
        val tvRepository: TextView = findViewById(R.id.item_repository)
        val tvFollowers: TextView = findViewById(R.id.item_followers)
        val tvFollowing: TextView = findViewById(R.id.item_following)

        val user = intent.getParcelableExtra<Users>(EXTRA_DATA) as Users
        val (photo, username,name, location, repository , company, followers, following) =user
        if (photo != null) {
            imgPhoto.setImageResource(photo)
        }
        tvUserName.text = username
        tvName.text = name
        tvLocation.text = location
        tvRepository.text = repository
        tvCompany.text = company
        tvFollowers.text = followers
        tvFollowing.text = following

    }

}