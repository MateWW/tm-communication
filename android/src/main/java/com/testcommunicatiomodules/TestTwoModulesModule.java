package com.testcommunicatiomodules;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = TestTwoModulesModule.NAME)
public class TestTwoModulesModule extends NativeTestTwoModulesSpec {
  public static final String NAME = "TestTwoModules";

  public double a = 1;
  public double b = 1;

  public TestTwoModulesModule(ReactApplicationContext reactContext) {
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
  public double setMultiplicate(double a, double b) {
    this.a = a;
    this.b = b;
    return a * b;
  }
}
