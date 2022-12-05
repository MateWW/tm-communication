
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNTestCommunicatioModulesSpec.h"

@interface TestTwoModules : NSObject <NativeTestTwoModulesSpec>
@property double a;
@property double b;
#else
#import <React/RCTBridgeModule.h>

@interface TestTwoModules : NSObject <RCTBridgeModule>
#endif

@end
