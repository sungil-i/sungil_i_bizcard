package kr.sungil.bizcard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.sungil.bizcard.R
import kr.sungil.bizcard.databinding.ActivityLeeSangjunBinding

class LeeSangjunActivity : AppCompatActivity() {
	private lateinit var binding: ActivityLeeSangjunBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityLeeSangjunBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}