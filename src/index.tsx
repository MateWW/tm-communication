const TestCommunicatioModules = require('./NativeTestCommunicatioModules').default;

export function multiply(a: number, b: number): number {
  return TestCommunicatioModules.multiply(a, b);
}
