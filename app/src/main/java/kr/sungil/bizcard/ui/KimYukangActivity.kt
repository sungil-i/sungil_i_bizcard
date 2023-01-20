package kr.sungil.bizcard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.sungil.bizcard.R
import kr.sungil.bizcard.databinding.ActivityKimYukangBinding

class KimYukangActivity : AppCompatActivity() {
	private lateinit var binding: ActivityKimYukangBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityKimYukangBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}