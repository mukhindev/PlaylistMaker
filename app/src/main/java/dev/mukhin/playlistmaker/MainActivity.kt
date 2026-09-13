package dev.mukhin.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById<Button>(R.id.search_button)
        val mediaLibraryButton = findViewById<Button>(R.id.media_library_button)
        val settingsButton = findViewById<Button>(R.id.settings_button)

        val searchButtonClickListener = object : View.OnClickListener {
            override fun onClick(v: View) {
                showToast("Search")
            }
        }

        searchButton.setOnClickListener(searchButtonClickListener)

        mediaLibraryButton.setOnClickListener {
            showToast("Media Library")
        }

        settingsButton.setOnClickListener {
            showToast("Settings")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
    }
}
