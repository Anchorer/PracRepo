package prac.anchorer.org.pracrepo.anim;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import prac.anchorer.org.pracrepo.R;

public class AnimListAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mListData;

    public AnimListAdapter(Context context, List<String> mListData) {
        this.mContext = context;
        this.mListData = mListData;
    }

    @Override
    public int getCount() {
        return mListData.size();
    }

    @Override
    public String getItem(int position) {
        return mListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        String item = getItem(position);

        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_anim, null);
            holder = new ViewHolder();
            holder.textView = convertView.findViewById(R.id.text_tv);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textView.setText(item);
        return convertView;
    }

    class ViewHolder {
        TextView textView;
    }
}
