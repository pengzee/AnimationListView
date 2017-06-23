package work.pengzhe.com.animationlistview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;

/**
 * Created on 2017/6/23 16:52
 *
 * @author PengZee
 */

public class MyScrollView extends ScrollView {

    MyLinearLayout mContentView;

    public MyScrollView(Context context) {
        super(context);
    }

    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mContentView = (MyLinearLayout) getChildAt(0);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        View firstView = mContentView.getChildAt(0);
        firstView.getLayoutParams().height = getHeight();
        Log.i("pengzhe", "firstView: " + firstView.getClass().getSimpleName());
        Log.i("pengzhe", "firstView.getLayoutParams().height: " + firstView.getLayoutParams().height);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        View firstView = mContentView.getChildAt(0);
        Log.i("pengzhe", "firstView: " + firstView.getClass().getSimpleName());
        Log.i("pengzhe", "firstView.getLayoutParams().height: " + firstView.getLayoutParams().height);


        

    }


}
