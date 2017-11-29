package hyperhao.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Lenovo on 2017/11/22.
 */

public class MyViewGroup extends LinearLayout {
    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
//
//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        Log.d("HYP", "MyViewGroup onMeasure widthMeasureSpec " + Integer.toBinaryString(widthMeasureSpec));
//        Log.d("HYP", "MyViewGroup onMeasure heightMeasureSpec" + Integer.toBinaryString(heightMeasureSpec));
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//    }
//
//    @Override
//    protected void onLayout(boolean changed, int l, int t, int r, int b) {
//        Log.d("HYP", "MyViewGroup onLayout l" + l);
//        Log.d("HYP", "MyViewGroup onLayout t" + t);
//        Log.d("HYP", "MyViewGroup onLayout r" + r);
//        Log.d("HYP", "MyViewGroup onLayout b" + b);
//        super.onLayout(changed, l, t, r, b);
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        Log.d("HYP", "MyViewGroup onDraw");
//        super.onDraw(canvas);
//    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("HYP", "MyViewGroup dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("HYP", "MyViewGroup onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("HYP", "MyViewGroup onTouchEvent");
        return super.onTouchEvent(event);
    }
}
