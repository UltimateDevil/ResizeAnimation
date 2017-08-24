package ultimate.devil.myapplication;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by Vikas on 06-Aug-17.
 */

public class UltimateResizeAnimation extends Animation {

    private final int startWidth;
    private final int startHeight;
    private final int targetHeight;
    private final int targetWidth;
    private View view;

    public UltimateResizeAnimation(View view, int targetWidth, int targetHeight, int startHeight, int startWidth) {
        this.view = view;
        this.targetWidth = targetWidth;
        this.targetHeight = targetHeight;
        this.startWidth = startWidth;
        this.startHeight = startHeight;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        int newWidth = (int) (startWidth + (targetWidth - startWidth) * interpolatedTime);
        int newHeight = (int) (startHeight + (targetHeight - startHeight) * interpolatedTime);
        view.getLayoutParams().width = newWidth;
        view.getLayoutParams().height = newHeight;
        view.requestLayout();
    }

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
    }

    @Override
    public boolean willChangeBounds() {
        return true;
    }
}
