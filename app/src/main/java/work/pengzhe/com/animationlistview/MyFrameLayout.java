package work.pengzhe.com.animationlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;

/**
 * Created on 2017/6/22 15:12
 *
 * @author PengZee
 */


//        <attr name="startColor" format="integer"/>
//                <attr name="endColor" format="integer"/>
//                <attr name="translateFrom"/>
//                <attr name="alpha" format="float"/>
//                <attr name="scaleX" format="float"/>
//                <attr name="scaleY" format="float"/>

public class MyFrameLayout extends FrameLayout implements AnimationInterface {

    private int startColor;
    private int endColor;
    private int translateDirection;
    private float alpha;
    private float scaleX;
    private float scaleY;

    private int defaultColor = 0xffffffff;

    public MyFrameLayout(@NonNull Context context) {
        super(context, null);
    }
//
//    public MyFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
//        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MyStyle);
//        startColor = a.getInt(R.styleable.MyStyle_startColor, defaultColor);
//        endColor = a.getInt(R.styleable.MyStyle_endColor, defaultColor);
//        scaleX = a.getFloat(R.styleable.MyStyle_scaleX, 0.5f);
//        scaleY = a.getFloat(R.styleable.MyStyle_scaleY, 0.5f);
//        alpha = a.getFloat(R.styleable.MyStyle_alpha, 0.3f);
//        translateDirection = a.getInt(R.styleable.MyStyle_translateFrom, -1);
//        a.recycle();
//    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
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

    public int getTranslateDirection() {
        return translateDirection;
    }

    public void setTranslateDirection(int translateDirection) {
        this.translateDirection = translateDirection;
    }

    @Override
    public float getAlpha() {
        return alpha;
    }

    @Override
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    @Override
    public float getScaleX() {
        return scaleX;
    }

    @Override
    public void setScaleX(float scaleX) {
        this.scaleX = scaleX;
    }

    @Override
    public float getScaleY() {
        return scaleY;
    }

    @Override
    public void setScaleY(float scaleY) {
        this.scaleY = scaleY;
    }

    public int getDefaultColor() {
        return defaultColor;
    }

    public void setDefaultColor(int defaultColor) {
        this.defaultColor = defaultColor;
    }

    @Override
    public void startAnim() {

    }

    @Override
    public void restoreAnim() {

    }
}
