import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
	`The package 'react-native-get-device-locale' doesn't seem to be linked. Make sure: \n\n` +
	Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
	'- You rebuilt the app after installing the package\n' +
	'- You are not using Expo Go\n';

// @ts-ignore
const isTurboModuleEnabled = global.__turboModuleProxy != null;

const GetDeviceLocaleModule = isTurboModuleEnabled
	? require('./NativeGetDeviceLocale').default
	: NativeModules.GetDeviceLocale;

const GetDeviceLocale = GetDeviceLocaleModule
	? GetDeviceLocaleModule
	: new Proxy(
			{},
			{
				get() {
					throw new Error(LINKING_ERROR);
				},
			}
		);

export async function getDeviceLocale(defaultLocale = "en_US"): Promise<string> {
	try {
		const result = await GetDeviceLocale.getDeviceLocale();
		return (result);
	} catch (error) {
		console.error(error);
		return (defaultLocale);
	}
}
