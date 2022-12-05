package com.testcommunicatiomodules;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = TestCommunicatioModulesModule.NAME)
public class TestCommunicatioModulesModule extends NativeTestCommunicatioModulesSpec {
  public static final String NAME = "TestCommunicatioModules";

  public TestCommunicatioModulesModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @Override
  public double multiply(double a, double b) {
    TestTwoModulesModule module = this.getReactApplicationContext().getNativeModule(TestTwoModulesModule.class);
    return a * b * module.a * module.b;
  }
}
