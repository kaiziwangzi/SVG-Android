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
public class ic_signal_wifi_1_bar extends SVGRenderer {

    public ic_signal_wifi_1_bar(Context context) {
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
        
        mPath.moveTo(12.01f, 21.49f);
        mPath.lineTo(23.64f, 7.0f);
        mPath.rCubicTo(-0.45f, -0.34f, -4.93f, -4.0f, -11.64f, -4.0f);
        mPath.cubicTo(5.28f, 3.0f, 0.81f, 6.66f, 0.36f, 7.0f);
        mPath.rLineTo(11.63f, 14.49f);
        mPath.rLineTo(0.01f, 0.01f);
        mPath.rLineTo(0.01f, -0.01f);
        mPath.close();
        mPath.moveTo(12.01f, 21.49f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(6.67f, 14.86f);
        mPath.lineTo(12.0f, 21.49f);
        mPath.rLineTo(0f, 0.01f);
        mPath.rLineTo(0.01f, -0.01f);
        mPath.rLineTo(5.33f, -6.63f);
        mPath.cubicTo(17.06f, 14.65f, 15.03f, 13.0f, 12.0f, 13.0f);
        mPath.rCubicTo(-3.0299997f, 0.0f, -5.06f, 1.65f, -5.33f, 1.86f);
        mPath.close();
        mPath.moveTo(6.67f, 14.86f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}