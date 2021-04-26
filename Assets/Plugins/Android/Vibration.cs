using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public static class Vibration
{
    private static string className = "com.jimmy01.unityvibrationandroid.Vibration";
    
    public static AndroidJavaObject pluginclass;
    private static AndroidJavaClass playerClass = new AndroidJavaClass("com.unity3d.player.UnityPlayer");
     static Vibration()
    {
        pluginclass = new AndroidJavaObject(className);
        
        var activity = playerClass.GetStatic<AndroidJavaObject>("currentActivity");
        pluginclass.Set("mainActivity",activity);
    }

    public static void Vibrate(long ms)
    {
        pluginclass.Call("Vibrate",ms);
    }
    
}
