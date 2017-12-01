package sample.samplekotlinandroidextensions

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.button.setOnClickListener {
            this.textView.text = "ハローワールド！"
        }

        this.showFragmentActivityButton.setOnClickListener {
            this.startActivity(Intent(this, FragmentActivity::class.java))
        }
    }
}
