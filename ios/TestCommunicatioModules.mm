#import "TestCommunicatioModules.h"
#import "TestTwoModules.h"
#import "RCTImageLoaderWithAttributionProtocol.h"

@implementation TestCommunicatioModules
RCT_EXPORT_MODULE("TestCommunicatioModules")

@synthesize moduleRegistry = _moduleRegistry;

- (NSNumber *)multiply:(double)a b:(double)b {
    TestTwoModules* _module = [_moduleRegistry moduleForName:"TestTwoModules"];
    NSNumber *result = @(a * [_module a] * b * [_module b]);
    return result;
}

// Don't compile this code when we build for the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeTestCommunicatioModulesSpecJSI>(params);
}
#endif

@end
