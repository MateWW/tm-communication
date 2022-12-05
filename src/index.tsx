import TestModules from './NativeTestTwoModules';
import TestCommunicatioModules from './NativeTestCommunicatioModules';

export function multiply(a: number, b: number): number {
  TestModules.setMultiplicate(10, 10);
  return TestCommunicatioModules.multiply(a, b);
}
