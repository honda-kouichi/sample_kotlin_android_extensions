package sample.samplekotlinandroidextensions

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sample.view.*

class SampleFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sample, container, false)
        view.helloFragmentButton.setOnClickListener {
            view.helloFragmentTextView.text = "ハロー フラグメント"
        }
        return view
    }
    
    companion object {
        fun createInstance(): SampleFragment = SampleFragment()
    }
}