
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNGetDeviceLocaleSpec.h"

@interface GetDeviceLocale : NSObject <NativeGetDeviceLocaleSpec>
#else
#import <React/RCTBridgeModule.h>

@interface GetDeviceLocale : NSObject <RCTBridgeModule>
#endif

@end
