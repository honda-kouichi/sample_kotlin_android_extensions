package sample.samplekotlinandroidextensions

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sample.*

class SampleFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_sample, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.helloFragmentButton.setOnClickListener {
            this.helloFragmentTextView.text = "ハロー フラグメント"
        }
    }

    companion object {
        fun createInstance(): SampleFragment = SampleFragment()
    }
}