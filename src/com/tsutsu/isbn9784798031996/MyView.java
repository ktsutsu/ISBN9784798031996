package com.tsutsu.isbn9784798031996;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {

	public MyView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyView(Context context) {
		super(context);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawColor(Color.WHITE);
		Paint paint = new Paint();
		paint.setColor(Color.RED);
		paint.setStrokeWidth(10);
		canvas.drawLine(100, 100, 250, 250, paint);
		paint.setStrokeWidth(30);
		canvas.drawLine(100, 250, 250, 100, paint);
	}

}
