package kr.sungil.bizcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.view.isVisible
import kr.sungil.bizcard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding
	private lateinit var adapter: PortfolioAdapter
	private lateinit var spAdapter: ArrayAdapter<String>
	private var isShow = false
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)
		adapter = PortfolioAdapter()
		binding.rvPortpolio.adapter = adapter
		adapter.submitList(Portfolios.items)

		// Spinner
		val name_array = resources.getStringArray(R.array.name_array)
		spAdapter = ArrayAdapter(
			this,
			androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
			name_array
		)
		binding.spName.adapter = spAdapter
		binding.spName.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
			override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
				when (position) {
					0 -> {}
					1 -> {
//						Log.d(MYDEBUG, "Spinner 1")
//						val intent = Intent(applicationContext, SpinnerActivity::class.java)
//						intent.putExtra("name", "송주환")
//						startActivity(intent)
					}
					2 -> {
//						Log.d(MYDEBUG, "Spinner 2")
//						val intent = Intent(applicationContext, SpinnerActivity::class.java)
//						intent.putExtra("name", "김유강")
//						startActivity(intent)
					}
					3 -> {
//						Log.d(MYDEBUG, "Spinner 3")
//						val intent = Intent(applicationContext, SpinnerActivity::class.java)
//						intent.putExtra("name", "고준성")
//						startActivity(intent)
					}
					4 -> {
//						Log.d(MYDEBUG, "Spinner 4")
//						val intent = Intent(applicationContext, SpinnerActivity::class.java)
//						intent.putExtra("name", "정한얼")
//						startActivity(intent)
					}
					5 -> {
//						Log.d(MYDEBUG, "Spinner 5")
//						val intent = Intent(applicationContext, SpinnerActivity::class.java)
//						intent.putExtra("name", "강주훈")
//						startActivity(intent)
					}
					6 -> {
//						Log.d(MYDEBUG, "Spinner 6")
//						val intent = Intent(applicationContext, SpinnerActivity::class.java)
//						intent.putExtra("name", "문시영")
//						startActivity(intent)
					}
					7 -> {
//						Log.d(MYDEBUG, "Spinner 7")
//						val intent = Intent(applicationContext, SpinnerActivity::class.java)
//						intent.putExtra("name", "손태영")
//						startActivity(intent)
					}
					8 -> {
//						Log.d(MYDEBUG, "Spinner 8")
//						val intent = Intent(applicationContext, SpinnerActivity::class.java)
//						intent.putExtra("name", "이상준")
//						startActivity(intent)
					}
				}
			}

			override fun onNothingSelected(parent: AdapterView<*>?) {}
		}

		// Toggle Button
		binding.btToggle.setOnClickListener {
			isShow = !isShow
			binding.rvPortpolio.isVisible = isShow
		}
	}
}