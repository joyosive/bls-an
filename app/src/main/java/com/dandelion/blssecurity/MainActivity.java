package com.dandelion.blssecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    static {
//        System.loadLibrary("libblst");
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("blst");
        }
        catch (UnsatisfiedLinkError e) {
//                String[] cmd = System.getProperty("sun.java.command").split("/");
//        	if (!"blstJNI".equals(cmd[cmd.length-1]))
//                    // suppress exception if 'main' below is executed
            throw new RuntimeException(e.getMessage());
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Runnable.secure();
    }
}