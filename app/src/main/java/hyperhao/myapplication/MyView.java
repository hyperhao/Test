package hyperhao.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Lenovo on 2017/11/22.
 */

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//
//
//        int mode = MeasureSpec.getMode(widthMeasureSpec);
//        Log.d("HYP", "MyView onMeasure " + Integer.toBinaryString(mode));
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//    }
//
//    @Override
//    protected void onLayout(boolean changed, int l, int t, int r, int b) {
//        Log.d("HYP", "MyView onLayout ");
//        super.onLayout(changed, l, t, r, b);
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        Log.d("HYP", "MyView onDraw");
//        super.onDraw(canvas);
//    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("HYP", "MyView dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("HYP", "MyView onTouchEvent");
        return super.onTouchEvent(event);
    }
}
