#import "GetDeviceLocale.h"

@implementation GetDeviceLocale
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(getDeviceLocale:(RCTPromiseResolveBlock)resolve
                  reject:(RCTPromiseRejectBlock)reject)
{
	NSString *locale = [[NSLocale currentLocale] localeIdentifier];

	resolve(locale);
}

#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
	(const facebook::react::ObjCTurboModule::InitParams &)params
{
	return std::make_shared<facebook::react::NativeGetDeviceLocaleSpecJSI>(params);
}
#endif

@end
