package io.github.wildmelon.melonbasis.app

import android.app.Application


class SupportApp : Application() {

  @Volatile private var mInstance: SupportApp? = null

  override fun onCreate() {
    super.onCreate()
    initialize()
  }

  private fun initialize() {
    mInstance = this
    registerActivityLifecycleCallbacks(AppActivityLifecycleCallbacks())
  }
}
