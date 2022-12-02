
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNTestCommunicatioModulesSpec.h"

@interface TestCommunicatioModules : NSObject <NativeTestCommunicatioModulesSpec>
#else
#import <React/RCTBridgeModule.h>

@interface TestCommunicatioModules : NSObject <RCTBridgeModule>
#endif

@end
