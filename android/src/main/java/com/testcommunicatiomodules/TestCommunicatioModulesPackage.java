package com.testcommunicatiomodules;

import androidx.annotation.Nullable;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.TurboReactPackage;

import java.util.HashMap;
import java.util.Map;

public class TestCommunicatioModulesPackage extends TurboReactPackage {

  @Nullable
  @Override
  public NativeModule getModule(String name, ReactApplicationContext reactContext) {
    if (name.equals(TestCommunicatioModulesModule.NAME)) {
      return new TestCommunicatioModulesModule(reactContext);
    } else if(name.equals(TestTwoModulesModule.NAME)) {
      return new TestTwoModulesModule(reactContext);
    } else {
      return null;
    }
  }

  @Override
  public ReactModuleInfoProvider getReactModuleInfoProvider() {
    return () -> {
      final Map<String, ReactModuleInfo> moduleInfos = new HashMap<>();
      moduleInfos.put(
              TestCommunicatioModulesModule.NAME,
              new ReactModuleInfo(
                      TestCommunicatioModulesModule.NAME,
                      TestCommunicatioModulesModule.NAME,
                      false, // canOverrideExistingModule
                      false, // needsEagerInit
                      true, // hasConstants
                      false, // isCxxModule
                      true // isTurboModule
      ));
      moduleInfos.put(
        TestTwoModulesModule.NAME,
        new ReactModuleInfo(
          TestTwoModulesModule.NAME,
          TestTwoModulesModule.NAME,
          false, // canOverrideExistingModule
          false, // needsEagerInit
          true, // hasConstants
          false, // isCxxModule
          true // isTurboModule
        ));
      return moduleInfos;
    };
  }
}
