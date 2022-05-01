package com.reactnativemultiplelaunchicon

import android.util.Log
import android.app.Application
import android.content.Context
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import android.app.Activity
import android.app.PendingIntent
import android.content.IntentSender.SendIntentException
import android.os.Bundle
import androidx.core.app.ActivityCompat.startIntentSenderForResult
import com.facebook.react.bridge.Promise
import android.content.ComponentName;
import android.content.pm.PackageManager;

class MultipleLaunchIconModule :ReactContextBaseJavaModule{
  var myContext: ReactApplicationContext;
  var packageName : String ="";
  constructor (context:ReactApplicationContext):super(context){
    this.myContext= context
    this.packageName=this.myContext.getPackageName()
    Log.i("===>","activeClass.toString()")  
  }
  override fun getName():String{
    return "MultipleLaunchIcon"
  }
  @ReactMethod
    fun multiply(a: Int, b: Int, promise: Promise) {     
      promise.resolve(a * b)
    }
@ReactMethod fun changeIcon(enableIcon:String) {
  val manager :PackageManager =myContext.getPackageManager();
  val activeClass = "$packageName.MainActivity$enableIcon" 
  val currentActivity  = manager.getActivityInfo(myContext.getCurrentActivity()?.getComponentName(), 0);
  //Log.i("===>",currentActivity.name.toString())
  Log.i("===>",activeClass.toString())  
  if(activeClass!=currentActivity.name){
  manager.setComponentEnabledSetting(ComponentName(myContext, currentActivity.name.toString()), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)

 manager.setComponentEnabledSetting(ComponentName(myContext, activeClass::class.java), PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)
  }
}

 
}

