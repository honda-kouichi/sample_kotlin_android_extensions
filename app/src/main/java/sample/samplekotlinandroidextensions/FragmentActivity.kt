package sample.samplekotlinandroidextensions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        this.supportFragmentManager.beginTransaction().add(
                R.id.helloFragmentContainer, SampleFragment.createInstance()).commit()
    }
}
