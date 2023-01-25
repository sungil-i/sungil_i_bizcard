package kr.sungil.bizcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kr.sungil.bizcard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding
	private lateinit var adapter: PortfolioAdapter
	private var isShow : Boolean = false

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		adapter = PortfolioAdapter()
		setContentView(binding.root)
		binding.rvPort.adapter = adapter
		// Code Here
		adapter.submitList(Portfolios.items)

		binding.btToggle.setOnClickListener {
			isShow = !isShow
			binding.rvPort.isVisible = isShow
		}
	}
}