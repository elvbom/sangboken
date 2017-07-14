package isisochbast.se.sangboken;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by henri3 on 14/07/17.
 */
public class AverageAdapter extends ArrayAdapter<String> {

    private Typeface tf;
    private LayoutInflater inflater;
    private int resource;
    private int textViewResourceId;
    private String[] objects;

    public AverageAdapter(Context context, int resource, Typeface tf) {
        super(context, resource);
        this.tf = tf;
        this.resource = resource;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(resource, parent, false);
        }

        TextView text = (TextView) convertView.findViewById(textViewResourceId);
        text.setTypeface(tf);
        text.setText(objects[position]);
        return convertView;
    }
}