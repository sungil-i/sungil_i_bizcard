package kr.sungil.bizcard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.sungil.bizcard.R
import kr.sungil.bizcard.databinding.ActivityKangJuhoonBinding

class KangJuhoonActivity : AppCompatActivity() {
	private lateinit var binding: ActivityKangJuhoonBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityKangJuhoonBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}