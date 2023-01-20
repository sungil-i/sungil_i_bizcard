package kr.sungil.bizcard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.sungil.bizcard.R
import kr.sungil.bizcard.databinding.ActivityKoJunseongBinding

class KoJunseongActivity : AppCompatActivity() {
	private lateinit var binding: ActivityKoJunseongBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityKoJunseongBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}