package com.project.facedemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author: ZRT
 * Email: zhuruotong@jeejio.com
 * Date: 2019/6/17 16:54
 * Description: It's use to ...
 */
public class MyImageView extends View {

    private int pointX;
    private int pointY;
    private int rectangleTopX;
    private int rectangleTopY;
    private int rectangleWidth;
    private int rectangleHeight;
    private Paint mPaint;

    public MyImageView(Context context) {
        super(context);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, null);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, null, -1);
        initPint();
    }

    private void initPint() {
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(20f);
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public void setRectangleTopX(int rectangleTopX) {
        this.rectangleTopX = rectangleTopX;
    }

    public void setRectangleTopY(int rectangleTopY) {
        this.rectangleTopY = rectangleTopY;
    }

    public void setRectangleWidth(int rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
    }

    public void setRectangleHeight(int rectangleHeight) {
        this.rectangleHeight = rectangleHeight;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(new Rect(100,120,200,220),mPaint);
    }
}
