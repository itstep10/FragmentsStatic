package org.itstep.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Koren Vitalii on 12.05.2018.
 */
public class Fragment1 extends Fragment
{
    final String TAG = "Debug_Fragment1";

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        Log.d(TAG, "Fragment1 onAttach");
    }

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Fragment1 onCreate");
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        Log.d(TAG, "Fragment1 onCreateView");
        return inflater.inflate(R.layout.fragment1, null);
    }

    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "Fragment1 onActivityCreated");
    }

    public void onStart()
    {
        super.onStart();
        Log.d(TAG, "Fragment1 onStart");
    }

    public void onResume()
    {
        super.onResume();
        Log.d(TAG, "Fragment1 onResume");
    }

    public void onPause()
    {
        super.onPause();
        Log.d(TAG, "Fragment1 onPause");
    }

    public void onStop()
    {
        super.onStop();
        Log.d(TAG, "Fragment1 onStop");
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        Log.d(TAG, "Fragment1 onDestroyView");
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, "Fragment1 onDestroy");
    }

    public void onDetach()
    {
        super.onDetach();
        Log.d(TAG, "Fragment1 onDetach");
    }
}
