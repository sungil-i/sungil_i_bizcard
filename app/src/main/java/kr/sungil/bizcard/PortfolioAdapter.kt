package kr.sungil.bizcard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.sungil.bizcard.databinding.RvItemPortpolioBinding

class PortfolioAdapter : ListAdapter<PortfolioModel, PortfolioAdapter.ViewHolder>(diffUtil) {

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
	inner class ViewHolder(
		private val binding: RvItemPortpolioBinding //XML디자인
	) : RecyclerView.ViewHolder(binding.root) {
		fun bind(pm: PortfolioModel) { //바인드 함수안에 넣어줌
			// Code Here
			binding.apply {
				tvPort1.text = pm.name
				tvPort2.text = pm.desc
				Glide.with(binding.ivPort.context)
					.load(pm.imageUrl)
					.into(binding.ivPort)
			}
		}
	}

	// DiffUtil Object
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