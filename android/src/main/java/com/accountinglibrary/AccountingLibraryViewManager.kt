package com.accountinglibrary

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.AccountingLibraryViewManagerInterface
import com.facebook.react.viewmanagers.AccountingLibraryViewManagerDelegate
import com.facebook.soloader.SoLoader

@ReactModule(name = AccountingLibraryViewManager.NAME)
class AccountingLibraryViewManager : SimpleViewManager<AccountingLibraryView>(),
  AccountingLibraryViewManagerInterface<AccountingLibraryView> {
  private val mDelegate: ViewManagerDelegate<AccountingLibraryView>

  init {
    mDelegate = AccountingLibraryViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<AccountingLibraryView>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): AccountingLibraryView {
    return AccountingLibraryView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: AccountingLibraryView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "AccountingLibraryView"

    init {
      if (BuildConfig.CODEGEN_MODULE_REGISTRATION != null) {
        SoLoader.loadLibrary(BuildConfig.CODEGEN_MODULE_REGISTRATION)
      }
    }
  }
}
