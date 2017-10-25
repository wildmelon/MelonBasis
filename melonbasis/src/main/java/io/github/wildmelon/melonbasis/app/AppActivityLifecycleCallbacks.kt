package io.github.wildmelon.melonbasis.app

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import io.github.wildmelon.melonbasis.BuildConfig


class AppActivityLifecycleCallbacks : Application.ActivityLifecycleCallbacks {

  override fun onActivityCreated(p0: Activity?, p1: Bundle?) {
    if (BuildConfig.DEBUG) Log.i("onActivityCreated", p0?.localClassName)
  }

  override fun onActivityPaused(p0: Activity?) {

  }

  override fun onActivityResumed(p0: Activity?) {

  }

  override fun onActivityStarted(p0: Activity?) {

  }

  override fun onActivityDestroyed(p0: Activity?) {

  }

  override fun onActivitySaveInstanceState(p0: Activity?, p1: Bundle?) {

  }

  override fun onActivityStopped(p0: Activity?) {

  }


}