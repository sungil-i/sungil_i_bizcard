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
		private val binding: RvItemPortpolioBinding
	) : RecyclerView.ViewHolder(binding.root) {
		fun bind(pm: PortfolioModel) {
			// Code Here

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