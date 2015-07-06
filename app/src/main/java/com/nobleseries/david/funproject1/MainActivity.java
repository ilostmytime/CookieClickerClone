package com.nobleseries.david.funproject1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;



public class MainActivity extends Activity {

    public int score = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        setGame();
        setStore();
    }

    private void setGame() {
        FrameLayout mainGame = (FrameLayout)findViewById(R.id.mainGame);
        RelativeLayout store = (RelativeLayout)findViewById(R.id.store);

        mainGame.setVisibility(View.VISIBLE);
        store.setVisibility(View.GONE);

    }
        public void cookieClick(View v){
            TextView scoreTxt = (TextView)findViewById(R.id.scoreTxt);
            score += 1;
            System.out.println("Score = :" + score);
            scoreTxt.setText("Score: " + score);
        }
        public void resetClick(View v){
            TextView scoreTxt = (TextView)findViewById(R.id.scoreTxt);
            score = 0;
            scoreTxt.setText("Score: " + score);
        }
        public void setStore(){
            final Button option1Btn = (Button)findViewById(R.id.option1Btn);
            final Button option2Btn = (Button)findViewById(R.id.option2Btn);


            if(score >= 150){
                option2Btn.setEnabled(true);
            }
            else if(score >= 100){
                option1Btn.setEnabled(true);

            }
            else{
                option1Btn.setEnabled(false);
                option2Btn.setEnabled(false);
            }

        }
    public void accessStore(View v){
        final Button storeBtn = (Button)findViewById(R.id.storeBtn);
        storeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent displayStore = new Intent(MainActivity.this, store_activity.class);
                startActivity(displayStore);
           }
        });
    }
}
