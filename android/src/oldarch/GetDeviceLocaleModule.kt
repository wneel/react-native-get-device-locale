package com.getdevicelocale

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactMethod

class GetDeviceLocaleModule internal constructor(context: ReactApplicationContext) :
	ReactContextBaseJavaModule(context) {
	val moduleImpl = GetDeviceLocaleModuleImpl()

	@ReactMethod(isBlockingSynchronousMethod = false)
	fun getDeviceLocale(promise: Promise) {
		moduleImpl.getDeviceLocale(promise)
	}

	override fun getName(): String {
		return GetDeviceLocaleModuleImpl.NAME
	}
}
