package com.example.android.quakereport;

public class Quake {
    private double mMagnitude;
    private String[] mLocation;
    private String mTime;
    private String mURL;

    public Quake(double vMagnitude, String[] vLocation,String vTime, String vURL ) {
        mTime = vTime;
        mURL = vURL;
        mLocation = vLocation;
        mMagnitude = vMagnitude;
    }



    public double getMagnitude() {
        return mMagnitude;
    }

    public String getTime() {
        return mTime;
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
    public String getURL() {
        return mURL;
    }

}
