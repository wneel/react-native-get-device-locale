package com.getdevicelocale

import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext

class GetDeviceLocaleModule (context: ReactApplicationContext) :
	NativeGetDeviceLocaleSpec(context) {
		val moduleImpl = GetDeviceLocaleModuleImpl()

	override fun getDeviceLocale(promise: Promise) {
		moduleImpl.getDeviceLocale(promise)
	}
}
