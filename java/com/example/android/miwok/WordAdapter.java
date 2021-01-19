package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0 , words);
        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        Word currentWord = getItem(position);

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout, parent, false);
        }


        TextView defaultTranslationText = (TextView) listItemView.findViewById(R.id.defaultTrans_Text);
        defaultTranslationText.setText(currentWord.getmDefaultTranslation());

        TextView miwokTranslationText = (TextView) listItemView.findViewById(R.id.miwokTrans_Text);
        miwokTranslationText.setText(currentWord.getmMiwokTranslation());

        ImageView img = (ImageView) listItemView.findViewById(R.id.img);
        if (currentWord.hasImage()) {
            img.setImageResource(currentWord.getmImage());
        }else {
            img.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.lnr);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
