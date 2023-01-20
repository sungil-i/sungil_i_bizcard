package kr.sungil.bizcard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.sungil.bizcard.R
import kr.sungil.bizcard.databinding.ActivityMoonSiyeongBinding

class MoonSiyeongActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMoonSiyeongBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMoonSiyeongBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}