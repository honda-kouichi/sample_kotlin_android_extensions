package sample.samplekotlinandroidextensions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sample_list.*

class SampleListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        this.sampleRecyclerView.layoutManager = LinearLayoutManager(this)
        this.sampleRecyclerView.adapter = SampleRecyclerViewAdapter(
                itemDataList = listOf("Sample1", "Sample2", "Sample3"))
    }
}
