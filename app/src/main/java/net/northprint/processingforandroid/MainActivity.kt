package net.northprint.processingforandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import android.widget.FrameLayout
import processing.android.CompatUtils
import processing.android.PFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val frame = FrameLayout(this)
        frame.id = CompatUtils.getUniqueViewId()
        setContentView(
            frame,
            ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        )

        val sketch = Sketch()
        val fragment = PFragment(sketch)
        fragment.setView(frame, this)
    }
}
