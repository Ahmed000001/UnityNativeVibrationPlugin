package com.jimmy01.unityvibrationandroid
import android.*
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context.VIBRATOR_SERVICE
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.util.logging.Level
import java.util.logging.Logger

public   class Vibration{
    public  var mainActivity: Activity ?=null


   public fun Vibrate(time_ms:Long){

       val  vibrator = mainActivity?.getSystemService(VIBRATOR_SERVICE) as Vibrator
       //vibrator.vibrate(time_ms)
       if (vibrator.hasVibrator())
       {
           if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
           {
           vibrator.vibrate(VibrationEffect.createOneShot(time_ms,VibrationEffect.DEFAULT_AMPLITUDE))
           }
           else
           {
               vibrator.vibrate(time_ms)
           }
        }
}
}