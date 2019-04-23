package com.example.wassim.dynamicgrid;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * create an instance of this fragment.
 */
public class PlayFragment extends Fragment {

    LinearLayout linearLayout;
    GridLayout gridLayout;
    String DIFFICULTY = "EASY";
    int total = 0;
    String[] images = new String[7];

    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment

        View v = inflater.inflate(R.layout.fragment_play, null);
        return v;
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
        linearLayout = (LinearLayout)view.findViewById(R.id.playcontainer);
        gridLayout = (GridLayout)view.findViewById(R.id.grid);





        if(DIFFICULTY.equals("EASY")){
            gridLayout.setColumnCount(3);
            gridLayout.setRowCount(3);
            total = 8;

        }else if(DIFFICULTY.equals("MEDIUM")){
            gridLayout.setColumnCount(4);
            gridLayout.setRowCount(3);
            total = 12;

        }else{
            gridLayout.setColumnCount(4);
            gridLayout.setRowCount(4);
            total=16;
        }

        //https://github.com/nirfinz/AndroidMemoryGame/blob/master/app/src/main/java/com/nirfinz/memorygame/GameActivity.java

        for (int i = 0; i < total; i++) {


            ImageView btn = new ImageView(getContext());
                btn.setImageResource(AppConstant.getImageArray().get(i));
                btn.setScaleType(ImageView.ScaleType.FIT_XY);


            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            params.width = ((getResources().getDisplayMetrics().widthPixels)/gridLayout.getColumnCount());
            params.height = ((getResources().getDisplayMetrics().heightPixels)/gridLayout.getRowCount()-60);
            // if we r in easy mode we should extract another 20 px in height to fit screen correctly
            if(params.height == 620){
                params.height = params.height-20;
            }
            btn.setLayoutParams(params);


            // btn.setLayoutParams(lp);
            gridLayout.addView(btn);
        }

    }


}
