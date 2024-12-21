package com.getdevicelocale

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import java.util.Locale


@ReactModule(name = GetDeviceLocaleModule.NAME)
class GetDeviceLocaleModule(reactContext: ReactApplicationContext) :
	NativeGetDeviceLocaleSpec(reactContext) {

	override fun getName(): String {
		return NAME
	}

	override fun getDeviceLocale(promise: Promise) {
		try {
			val locale = Locale.getDefault().toString()
			promise.resolve(locale)
		} catch (e: Exception) {
			promise.reject("Error while attempting to get device locale: ", e.message)
		}
	}

	companion object {
		const val NAME = "GetDeviceLocale"
	}
}
