# react-native-get-device-locale

<p>
	<a href="https://github.com/wneel/react-native-get-device-locale/blob/HEAD/LICENSE">
		<img src="https://img.shields.io/badge/license-MIT-blue.svg" alt="React Native Wheel Picker is released under the MIT license." />
	</a>
	<a href="https://www.npmjs.com/package/react-native-get-device-locale">
		<img src="https://img.shields.io/npm/v/react-native-get-device-locale?color=brightgreen&label=npm%20package" alt="Current npm package version." />
	</a>
	<a href="https://www.npmjs.com/package/react-native-get-device-locale">
		<img src="https://img.shields.io/npm/dm/react-native-get-device-locale" alt="Number of downloads per week." />
	</a>
</p>

react-native-get-device-locale is a lightweight and efficient React Native module that provides easy access to the device's locale. Designed to work seamlessly with React Native’s new architecture, it replaces the now unreliable APIs (NativeModules.SettingsManager.settings.AppleLocale and similar) following recent updates in React Native.

<br />

## ✨ Features
- Retrieve the device’s locale in `en_US`, `fr_FR` format.
- Compatible with React Native >= 0.68, the new architecture (TurboModules) and backward compatibility with old arch.
- Minimal setup with low resource usage.

| Support |  |
| ----------- | -----------: |
| react-native version      | >=0.68 |
| Android   | ✅ |
| iOS   | ✅ |
| New Architecture   | ✅ |
| Old Architecture   | ✅ |

<br />

## 📦 Installation
```bash
npm install react-native-get-device-locale
```

## Additional Steps (iOS only)
After installation, run the following command in your project’s ios directory:
```bash
cd ios && pod install
```

<br />

## 📖 Usage Example
Here's how to use `react-native-get-device-locale to retrieve the device locale:
```tsx
const deviceLocale = await getDeviceLocale("fr_FR"); // Optional default locale if fetching fails (en_US by default in case of error)
```
<details>

<summary><h2>Minimal App demo:</h2></summary>

```tsx
import { useState, useEffect } from 'react';
import { View, Text } from 'react-native';
import { getDeviceLocale } from 'react-native-get-device-locale';

export default function App() {
	const [locale, setLocale] = useState<string | null>(null);

	useEffect(() => {
		(async () => {
			const deviceLocale = await getDeviceLocale();
			setLocale(deviceLocale);
		})();
	}, []);

	return (
		<View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
			<Text>Device Locale: {locale}</Text>
		</View>
	);
}
```
</details>


<br />

## 💼 Use Cases

This package serves as a replacement for deprecated native locale-fetching methods like:
- `NativeModules.SettingsManager.settings.AppleLocale`
- `NativeModules.SettingsManager.settings.AppleLanguages[0]`
- `NativeModules.I18nManager.localeIdentifier`

Which no longer work in React Native 0.76 and above. getDeviceLocale provides a reliable and modern way to access the device locale, compatible with the latest React Native architecture.

<br />

## 🔄 Roadmap and Future Features
Planned additions:

- Alternate locale formats (e.g., `en` or `en-US`).
- Getting all the device locales if multiple.

<br />

## 🛠️ Contributing
Contributions are welcome! We follow the [conventional commits](https://www.conventionalcommits.org/en/v1.0.0/) guidelines. To contribute:

1. Fork the repo.
2. Clone it and create a new branch.
3. Follow the commit message conventions.
4. Open a Pull Request!
> 💡 Tip: Make sure your commit messages are in English for consistency!

<br />

## 📞 Support
If you have questions or issues, feel free to open an issue on GitHub. I’ll stay active to respond to queries and provide support.

