#import "TestTwoModules.h"


@implementation TestTwoModules
RCT_EXPORT_MODULE("TestTwoModules")


- (NSNumber *)setMultiplicate:(double)a b:(double)b {
    self.a = a;
    self.b = b;
    NSNumber *result = @(a * b);
    
    return result;
}

// Don't compile this code when we build for the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeTestTwoModulesSpecJSI>(params);
}
#endif

@end
