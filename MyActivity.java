package com.example.myapp2;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    

    public void start(){
        int x = 1;
        x++;
    }
    public void methodl() {
        int x = 2;
    }

    int s = 10;
    public static void main(String[] args) {

    }
}
