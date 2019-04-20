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

        // FrameLayoutを作成
        val frame = FrameLayout(this)
        frame.id = CompatUtils.getUniqueViewId()
        setContentView(
            frame,
            ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        )

        // PAppletクラスを継承したSketchクラスをNewする
        val sketch = Sketch()
        // PFragmentで描画
        val fragment = PFragment(sketch)
        fragment.setView(frame, this)
    }
}
