package net.northprint.processingforandroid

import processing.core.PApplet

class Sketch : PApplet() {

    override fun setup() {
        // 背景色
        background(255)
    }

    override fun draw() {
        noStroke()

        // 色をランダムに設定
        val r = random(0f, 255f)
        val g = random(0f, 255f)
        val b = random(0f, 255f)

        // 位置をランダムに設定
        val x = random(0f, width.toFloat())
        val y = random(0f, height.toFloat())

        // 円の大きさをランダムに設定
        val d = random(10f, 100f)

        // 塗る
        fill(r, g, b)
        // 描く
        stroke(r, g, b)
        // 円
        ellipse(x, y, d, d)
    }
}