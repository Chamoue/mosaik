package mees.edukathon.mosaik;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class customPostAdapter implements ListAdapter {
    ArrayList<Post> arrayList;
    Context context;
    public customPostAdapter(Context context, ArrayList<Post> arrayList) {
        this.arrayList=arrayList;
        this.context=context;
    }
    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }
    @Override
    public boolean isEnabled(int position) {
        return true;
    }
    @Override
    public void registerDataSetObserver(DataSetObserver observer) {
    }
    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }
    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public boolean hasStableIds() {
        return false;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        Post post=arrayList.get(position);
//        if(convertView==null) {
//            LayoutInflater layoutInflater = LayoutInflater.from(context);
//            convertView=layoutInflater.inflate(R.layout.custom_post_list, null);
//            convertView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                }
//            });
//            TextView tittle=convertView.findViewById(R.id.title);
//            ImageView imag=convertView.findViewById(R.id.list_image);
//            tittle.setText(post.SubjectName);
//            Picasso.with(context)
//                    .load(post.Image)
//                    .into(imag);
//        }
//        return convertView;
        return null;
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }
    @Override
    public int getViewTypeCount() {
        return arrayList.size();
    }
    @Override
    public boolean isEmpty() {
        return false;
    }
}
