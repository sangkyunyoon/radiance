package org.pushingpixels.demo.rainbow.svg

import java.awt.*
import java.awt.geom.*
import java.awt.image.BufferedImage
import java.io.*
import java.lang.ref.WeakReference
import java.util.Base64
import javax.imageio.ImageIO
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.neon.icon.ResizableIcon.Factory
import org.pushingpixels.neon.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class ic_zoom_in_black_24px private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
    

	private fun innerPaint(g : Graphics2D) {
        @Suppress("UNUSED_VARIABLE") var shape: Shape?
        @Suppress("UNUSED_VARIABLE") var paint: Paint?
        @Suppress("UNUSED_VARIABLE") var stroke: Stroke?
        @Suppress("UNUSED_VARIABLE") var clip: Shape?

        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    val defaultTransform_ = g.transform
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
shape = GeneralPath()
shape.moveTo(15.5, 14.0)
shape.lineTo(14.71, 14.0)
shape.lineTo(14.43, 13.73)
shape.curveTo(15.41, 12.59, 16.0, 11.11, 16.0, 9.5)
shape.curveTo(16.0, 5.91, 13.09, 3.0, 9.5, 3.0)
shape.curveTo(5.91, 3.0, 3.0, 5.91, 3.0, 9.5)
shape.curveTo(3.0, 13.09, 5.91, 16.0, 9.5, 16.0)
shape.curveTo(11.11, 16.0, 12.59, 15.41, 13.73, 14.43)
shape.lineTo(14.0, 14.71)
shape.lineTo(14.0, 15.5)
shape.lineTo(19.0, 20.49)
shape.lineTo(20.49, 19.0)
shape.lineTo(15.5, 14.0)
shape.closePath()
shape.moveTo(9.5, 14.0)
shape.curveTo(7.01, 14.0, 5.0, 11.99, 5.0, 9.5)
shape.curveTo(5.0, 7.01, 7.01, 5.0, 9.5, 5.0)
shape.curveTo(11.99, 5.0, 14.0, 7.01, 14.0, 9.5)
shape.curveTo(14.0, 11.99, 11.99, 14.0, 9.5, 14.0)
shape.closePath()
paint = Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.transform = defaultTransform__0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
shape = GeneralPath()
shape.moveTo(12.0, 10.0)
shape.lineTo(10.0, 10.0)
shape.lineTo(10.0, 12.0)
shape.lineTo(9.0, 12.0)
shape.lineTo(9.0, 10.0)
shape.lineTo(7.0, 10.0)
shape.lineTo(7.0, 9.0)
shape.lineTo(9.0, 9.0)
shape.lineTo(9.0, 7.0)
shape.lineTo(10.0, 7.0)
shape.lineTo(10.0, 9.0)
shape.lineTo(12.0, 9.0)
shape.lineTo(12.0, 10.0)
shape.closePath()
paint = Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2
g.transform = defaultTransform__0
g.transform = defaultTransform_

	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 3.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 3.0
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 17.489999771118164
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 17.489999771118164
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return ic_zoom_in_black_24px(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(ic_zoom_in_black_24px(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { ic_zoom_in_black_24px(getOrigWidth().toInt(), getOrigHeight().toInt()) }
        }
    }

    override fun getIconHeight(): Int {
        return width
    }

    override fun getIconWidth(): Int {
        return height
    }

    override fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC)
        g2d.translate(x, y)

        val coef1 = this.width.toDouble() / getOrigWidth()
        val coef2 = this.height.toDouble() / getOrigHeight()
        val coef = Math.min(coef1, coef2)
        g2d.clipRect(0, 0, this.width, this.height)
        g2d.scale(coef, coef)
        g2d.translate(-getOrigX(), -getOrigY())
        if (coef1 != coef2) {
            if (coef1 < coef2) {
                val extraDy = ((getOrigWidth() - getOrigHeight()) / 2.0).toInt()
                g2d.translate(0, extraDy)
            } else {
                val extraDx = ((getOrigHeight() - getOrigWidth()) / 2.0).toInt()
                g2d.translate(extraDx, 0)
            }
        }
        val g2ForInner = g2d.create() as Graphics2D
        innerPaint(g2ForInner)
        g2ForInner.dispose()
        g2d.dispose()
    }
}

