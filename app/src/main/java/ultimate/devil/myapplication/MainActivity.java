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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buton= (Button)findViewById(R.id.button);

        final RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.activity_main);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UltimateResizeAnimation ultimate = new UltimateResizeAnimation(buton, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT,200,200);
                ultimate.setDuration(500);
                mainLayout.startAnimation(ultimate);
            }
        });
    }
}
