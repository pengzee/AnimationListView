package work.pengzhe.com.animationlistview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created on 2017/6/23 10:01
 *
 * @author PengZee
 */

public class MyLinearLayout extends LinearLayout {
    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    /**
     * 在 addView 之前会调用这个方法 用来生成LayoutParams
     * 此处拦截并接管layoutParams的生成
     *
     * @param attrs
     * @return
     */
    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new MyLayoutParams(getContext(), attrs);
    }


//        <attr name="startColor" format="integer"/>
//                <attr name="endColor" format="integer"/>
//                <attr name="translateFrom"/>
//                <attr name="alpha" format="float"/>
//                <attr name="scaleX" format="float"/>
//                <attr name="scaleY" format="float"/>


    private boolean detecCustomtAttrs(MyLayoutParams params) {

        int startColor = params.startColor;
        int endColor = params.endColor;
        float scaleX = params.scaleX;
        float scaleY = params.scaleY;
        float alpha = params.alpha;
        int translateDirection = params.translateDirection;

        if (startColor != -1 && endColor != -1 || scaleX != -1 || scaleY != -1 || alpha != -1 || translateDirection != -1) {
            return true;
        }
        return false;
    }


    /**
     * LinearLayout添加子View的方法
     * 此处接管该方法 给子View加壳
     *
     * @param child
     */
    @Override
    public void addView(View child, ViewGroup.LayoutParams params) {
        MyLayoutParams layoutParams = (MyLayoutParams) params;
        if (detecCustomtAttrs(layoutParams)) {
            MyFrameLayout myFrameLayout = new MyFrameLayout(getContext());
            myFrameLayout.addView(child);
            myFrameLayout.setAlpha(layoutParams.alpha);
            myFrameLayout.setStartColor(layoutParams.startColor);
            myFrameLayout.setEndColor(layoutParams.endColor);
            myFrameLayout.setScaleX(layoutParams.scaleX);
            myFrameLayout.setScaleY(layoutParams.scaleY);
            myFrameLayout.setTranslateDirection(layoutParams.translateDirection);
            super.addView(myFrameLayout, params);
        } else {
            super.addView(child, params);
        }
    }


    public class MyLayoutParams extends LayoutParams {

        int startColor;
        int endColor;
        float scaleX;
        float scaleY;
        float alpha;
        int translateDirection;


        public MyLayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a = c.obtainStyledAttributes(attrs, R.styleable.MyStyle);
            startColor = a.getInt(R.styleable.MyStyle_startColor, -1);
            endColor = a.getInt(R.styleable.MyStyle_endColor, -1);
            scaleX = a.getFloat(R.styleable.MyStyle_scaleX, -1);
            scaleY = a.getFloat(R.styleable.MyStyle_scaleY, -1);
            alpha = a.getFloat(R.styleable.MyStyle_alpha, -1);
            translateDirection = a.getInt(R.styleable.MyStyle_translateFrom, -1);
            a.recycle();
        }

        public int getStartColor() {
            return startColor;
        }

        public void setStartColor(int startColor) {
            this.startColor = startColor;
        }

        public int getEndColor() {
            return endColor;
        }

        public void setEndColor(int endColor) {
            this.endColor = endColor;
        }

        public float getScaleX() {
            return scaleX;
        }

        public void setScaleX(float scaleX) {
            this.scaleX = scaleX;
        }

        public float getScaleY() {
            return scaleY;
        }

        public void setScaleY(float scaleY) {
            this.scaleY = scaleY;
        }

        public float getAlpha() {
            return alpha;
        }

        public void setAlpha(float alpha) {
            this.alpha = alpha;
        }

        public int getTranslateDirection() {
            return translateDirection;
        }

        public void setTranslateDirection(int translateDirection) {
            this.translateDirection = translateDirection;
        }
    }
}
