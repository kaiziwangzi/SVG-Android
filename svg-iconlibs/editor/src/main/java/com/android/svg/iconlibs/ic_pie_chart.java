package com.android.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.android.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_pie_chart extends SVGRenderer {

    public ic_pie_chart(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(11.0f, 2.0f);
        mPath.rLineTo(0f, 20.0f);
        mPath.rCubicTo(-5.07f, -0.5f, -9.0f, -4.79f, -9.0f, -10.0f);
        mPath.rCubicTo(0.0f, -5.209999f, 3.93f, -9.5f, 9.0f, -10.0f);
        mPath.close();
        mPath.moveTo(11.0f, 2.0f);
        mPath.rMoveTo(2.03f, 0.0f);
        mPath.rLineTo(0f, 8.99f);
        mPath.lineTo(22.0f, 10.99f);
        mPath.rCubicTo(-0.47f, -4.74f, -4.24f, -8.52f, -8.97f, -8.99f);
        mPath.close();
        mPath.moveTo(13.03f, 2.0f);
        mPath.rMoveTo(0.0f, 11.01f);
        mPath.lineTo(13.03f, 22.0f);
        mPath.rCubicTo(4.74f, -0.47f, 8.5f, -4.25f, 8.97f, -8.99f);
        mPath.rLineTo(-8.97f, 0f);
        mPath.close();
        mPath.moveTo(13.03f, 13.01f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}