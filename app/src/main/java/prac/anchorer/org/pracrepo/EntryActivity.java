package prac.anchorer.org.pracrepo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import prac.anchorer.org.pracrepo.anim.LayoutAnimActivity;
import prac.anchorer.org.pracrepo.anim.ObjectAnimActivity;
import prac.anchorer.org.pracrepo.view.HorizontalScrollViewActivity;

public class EntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        findViewById(R.id.horizontal_sv_btn).setOnClickListener(v -> startActivity(new Intent(EntryActivity.this, HorizontalScrollViewActivity.class)));
        findViewById(R.id.anim_list_btn).setOnClickListener(v -> startActivity(new Intent(EntryActivity.this, LayoutAnimActivity.class)));
        findViewById(R.id.anim_object_btn).setOnClickListener(v -> startActivity(new Intent(EntryActivity.this, ObjectAnimActivity.class)));
    }
}
