package net.northprint.processingforandroid

import processing.core.PApplet


class Sketch : PApplet() {

    override fun setup() {
        background(255)
    }

    override fun draw() {
        // 出典
        // https://p5codeschool.net/

        // 図形の輪郭線を消す
        noStroke()
        // 白黒のランダムな色を設定
        fill(random(255f))
        // マウスの位置にランダムな大きさの楕円を描く
        ellipse(mouseX.toFloat(), mouseY.toFloat(), random(50f), random(50f))
    }
}