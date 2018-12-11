package prac.anchorer.org.pracrepo.anim;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import prac.anchorer.org.pracrepo.R;

public class LayoutAnimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_test);

        ListView listView = findViewById(R.id.list_lv);
        List<String> dataList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            dataList.add("ITEM [" + i + "]");
        }
        listView.setAdapter(new AnimListAdapter(this, dataList));
    }
}
