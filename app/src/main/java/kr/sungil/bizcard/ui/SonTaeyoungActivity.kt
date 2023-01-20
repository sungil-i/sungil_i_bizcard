package kr.sungil.bizcard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.sungil.bizcard.R
import kr.sungil.bizcard.databinding.ActivitySonTaeyoungBinding

class SonTaeyoungActivity : AppCompatActivity() {
	private lateinit var binding: ActivitySonTaeyoungBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivitySonTaeyoungBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}