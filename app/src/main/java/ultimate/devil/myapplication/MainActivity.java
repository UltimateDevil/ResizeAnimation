package ultimate.devil.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import ultimate.devil.ultimateanimation.UltimateBounceAnimator;

public class MainActivity extends AppCompatActivity {
    private boolean resizeUp = false;
    private int targerHeight;
    private int targerWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout button= (RelativeLayout)findViewById(R.id.button);

        final RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.activity_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!resizeUp){
                    targerHeight = 600;
                    targerWidth = 600;
                    resizeUp=true;
                }else {
                    targerHeight = 200;
                    targerWidth = 200;
                    resizeUp=false;
                }
                UltimateResizeAnimation ultimate = new UltimateResizeAnimation(button, targerWidth,targerHeight);
                ultimate.setDuration(500);
                mainLayout.startAnimation(ultimate);
            }
        });
    }
}
