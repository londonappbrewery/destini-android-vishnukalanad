package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mTextView;
    Button mRButton;
    Button mGButton;
    private int mStoryIndex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = findViewById(R.id.storyTextView);
        mRButton = findViewById(R.id.buttonTop);
        mGButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("Click Red", "onClick: Triggered Red !");
                if (mStoryIndex == 1) {
                    mTextView.setText(R.string.T3_Story);
                    mRButton.setText(R.string.T3_Ans1);
                    mGButton.setText(R.string.T3_Ans2);
                    mStoryIndex++;
                } else if(mStoryIndex == 2) {
                    mTextView.setText(R.string.T6_End);
                    mRButton.setVisibility(View.GONE);
                    mGButton.setVisibility(View.GONE);
                } else if (mStoryIndex == 3) {
                    mTextView.setText(R.string.T3_Story);
                    mRButton.setText(R.string.T3_Ans1);
                    mGButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 4;
                } else {
                    mTextView.setText(R.string.T6_End);
                    mRButton.setVisibility(View.GONE);
                    mGButton.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mGButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("Click Blue", "onClick: Triggered Blue!");
                if (mStoryIndex == 1) {
                    mTextView.setText(R.string.T2_Story);
                    mRButton.setText(R.string.T2_Ans1);
                    mGButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 2){
                    mTextView.setText(R.string.T5_End);
                    mRButton.setVisibility(View.GONE);
                    mGButton.setVisibility(View.GONE);
                } else if (mStoryIndex == 3) {
                    mTextView.setText(R.string.T4_End);
                    mRButton.setVisibility(View.GONE);
                    mGButton.setVisibility(View.GONE);
                } else {
                    mTextView.setText(R.string.T5_End);
                    mRButton.setVisibility(View.GONE);
                    mGButton.setVisibility(View.GONE);
                }
            }
        });

    }
}
