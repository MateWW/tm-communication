const TestCommunicatioModules =
  require('./NativeTestCommunicatioModules').default;
const TestModules = require('./NativeTestTwoModules').default;

export function multiply(a: number, b: number): number {
  TestModules.multiply(10, 10);
  return TestCommunicatioModules.multiply(1, 2);
}
