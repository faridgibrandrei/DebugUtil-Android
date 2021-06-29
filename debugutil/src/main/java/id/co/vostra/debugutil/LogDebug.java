package id.co.vostra.debugutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "SUPER_HELPFUL_LIBRARY";
    public static void d(String message) {
        Log.d(TAG, message);
    }
}
