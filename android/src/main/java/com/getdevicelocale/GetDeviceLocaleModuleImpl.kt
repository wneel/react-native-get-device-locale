package com.getdevicelocale;

import com.facebook.react.bridge.Promise
import java.util.Locale

class GetDeviceLocaleModuleImpl {

	fun getDeviceLocale(promise: Promise) {
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
