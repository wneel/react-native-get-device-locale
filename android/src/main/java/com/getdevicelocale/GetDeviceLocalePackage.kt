package com.getdevicelocale

import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider
import java.util.HashMap

class GetDeviceLocalePackage : BaseReactPackage() {
	override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
		return if (name == GetDeviceLocaleModule.NAME) {
			GetDeviceLocaleModule(reactContext)
		} else {
			null
		}
	}

	override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
		return ReactModuleInfoProvider {
			val moduleInfos: MutableMap<String, ReactModuleInfo> = HashMap()
			moduleInfos[GetDeviceLocaleModule.NAME] = ReactModuleInfo(
				GetDeviceLocaleModule.NAME,
				GetDeviceLocaleModule.NAME,
				false,  // canOverrideExistingModule
				false,  // needsEagerInit
				true,  // hasConstants
				false,  // isCxxModule
				true // isTurboModule
			)
			moduleInfos
		}
	}
}
