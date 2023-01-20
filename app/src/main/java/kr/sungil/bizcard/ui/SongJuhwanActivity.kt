package kr.sungil.bizcard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.sungil.bizcard.R
import kr.sungil.bizcard.databinding.ActivitySongJuhwanBinding

class SongJuhwanActivity : AppCompatActivity() {
	private lateinit var binding: ActivitySongJuhwanBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivitySongJuhwanBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}