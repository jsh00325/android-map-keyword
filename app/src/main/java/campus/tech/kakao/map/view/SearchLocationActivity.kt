package campus.tech.kakao.map.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import campus.tech.kakao.map.databinding.ActivitySearchLocationBinding
import campus.tech.kakao.map.model.SearchLocationRepository
import campus.tech.kakao.map.viewmodel.SearchLocationViewModel

class SearchLocationActivity : AppCompatActivity() {
	private lateinit var viewModel: SearchLocationViewModel
	private lateinit var binding: ActivitySearchLocationBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		viewModel = ViewModelProvider(this)[SearchLocationViewModel::class.java]
		viewModel.setRepository(SearchLocationRepository(this))
		binding = ActivitySearchLocationBinding.inflate(layoutInflater)
		setContentView(binding.root)

		binding.removeSearchInputButton.setOnClickListener {
			binding.searchInputEditText.text.clear()
		}

		binding.searchInputEditText.addTextChangedListener(object : TextWatcher {
			override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
			override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
			override fun afterTextChanged(s: Editable?) {
				viewModel.searchLocation(s.toString())
			}
		})
	}
}