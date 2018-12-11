package prac.anchorer.org.pracrepo.anim;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import prac.anchorer.org.pracrepo.R;

public class ObjectAnimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_object);

        TextView textView = findViewById(R.id.text_anim_tv_1);
        ValueAnimator colorAnim = ObjectAnimator.ofInt(textView, "backgroundColor", 0xFFFF8080, 0xFF8080FF);
        colorAnim.setDuration(300);
        colorAnim.setEvaluator(new ArgbEvaluator());
        colorAnim.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim.start();

        TextView textView2 = findViewById(R.id.text_anim_tv_2);
        ValueAnimator colorAnim2 = ObjectAnimator.ofInt(textView2, "backgroundColor", 0x8080FFFF, 0xFF8080FF);
        colorAnim2.setDuration(300);
        colorAnim2.setEvaluator(new ArgbEvaluator());
        colorAnim2.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim2.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim2.start();

        TextView textView3 = findViewById(R.id.text_anim_tv_3);
        ValueAnimator colorAnim3 = ObjectAnimator.ofInt(textView3, "backgroundColor", 0x00000000, 0xFFFFFFFF);
        colorAnim3.setDuration(300);
        colorAnim3.setEvaluator(new ArgbEvaluator());
        colorAnim3.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim3.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim3.start();

        TextView textView4 = findViewById(R.id.text_anim_tv_4);
        ValueAnimator colorAnim4 = ObjectAnimator.ofInt(textView4, "backgroundColor", 0x80808080, 0x89739790);
        colorAnim4.setDuration(300);
        colorAnim4.setEvaluator(new ArgbEvaluator());
        colorAnim4.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim4.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim4.start();
    }
}
