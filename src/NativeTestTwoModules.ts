import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  setMultiplicate(a: number, b: number): number;
}

export default TurboModuleRegistry.getEnforcing<Spec>('TestTwoModules');
