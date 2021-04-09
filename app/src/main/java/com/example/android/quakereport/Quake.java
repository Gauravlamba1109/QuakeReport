package com.example.android.quakereport;

public class Quake {
    private double mMagnitude;
    private String[] mLocation;
    private String mTime;

    public Quake(double vMagnitude, String[] vLocation, String vTime) {
        mTime = vTime;
        mLocation = vLocation;
        mMagnitude = vMagnitude;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation(int n) {
        String s = "NO DATA";
        int len = mLocation.length;
        if (len == 0) {
            return s;
        }
        if (len == 1) {
            return mLocation[0];
        } else return mLocation[n];
    }

    public String getTime() {
        return mTime;
    }
}
