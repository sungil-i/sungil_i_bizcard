package kr.sungil.bizcard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.sungil.bizcard.R
import kr.sungil.bizcard.databinding.ActivityJeongHaneolBinding

class JeongHaneolActivity : AppCompatActivity() {
	private lateinit var binding: ActivityJeongHaneolBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityJeongHaneolBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}