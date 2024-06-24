package kr.sungil.bizcard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.sungil.bizcard.databinding.RvItemPortpolioBinding

class PortfolioAdapter
	: ListAdapter<PortfolioModel, PortfolioAdapter.ViewHolder>(diffUtil) {

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		return ViewHolder(
			RvItemPortpolioBinding.inflate(
				LayoutInflater.from(parent.context),
				parent,
				false
			)
		)
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.bind(currentList[position])
	}

	// ViewHolder inner class
	// 내부 클래스입니다 ViewHolder : XML 디자인 파일과 연결
	inner class ViewHolder(
		private val binding: RvItemPortpolioBinding
	) : RecyclerView.ViewHolder(binding.root) {
		fun bind(pm: PortfolioModel) {
			// Code Here
			binding.apply {
				tvPort1.text = pm.name
				tvPort2.text = pm.desc
				Glide.with(ivPort.context)
					.load(pm.imageUrl)
					.into(ivPort)
			}
		}
	}

	// DiffUtil Object
	// RecyclerView 의 속도 향상을 위해서 사용합니다
	companion object {
		val diffUtil = object : DiffUtil.ItemCallback<PortfolioModel>() {
			override fun areItemsTheSame(oldItem: PortfolioModel, newItem: PortfolioModel): Boolean {
				return oldItem.idx == newItem.idx
			}

			override fun areContentsTheSame(oldItem: PortfolioModel, newItem: PortfolioModel): Boolean {
				return oldItem == newItem
			}
		}
	}
}