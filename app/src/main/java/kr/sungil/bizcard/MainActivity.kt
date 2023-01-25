package kr.sungil.bizcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kr.sungil.bizcard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding
	private lateinit var adapter: PortfolioAdapter
	private var isShow: Boolean = false

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		adapter = PortfolioAdapter()
		setContentView(binding.root)

		// Code Here
		// 리싸이클러뷰 Adapter 연결
		binding.rvPort.adapter = adapter
		// 리싸이클려뷰 데이터리스트 연결
		adapter.submitList(Portfolios.items)

		binding.btToggle.setOnClickListener {
			isShow = !isShow
			binding.rvPort.isVisible = isShow
		}
	}
}