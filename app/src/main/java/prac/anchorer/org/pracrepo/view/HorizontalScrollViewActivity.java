package prac.anchorer.org.pracrepo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import prac.anchorer.org.pracrepo.R;

public class HorizontalScrollViewActivity extends AppCompatActivity {

    private HorizontalScrollViewEx mScrollView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_scroll_view);

        mScrollView = findViewById(R.id.scroll_view);

        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i < 20; i++) {
            View view = inflater.inflate(R.layout.item_text, mScrollView, false);
            view.getLayoutParams().width = 400;
            TextView textView = view.findViewById(R.id.text_tv);
            textView.setText(String.valueOf(i + 1));
            mScrollView.addView(view);
        }
    }

}
