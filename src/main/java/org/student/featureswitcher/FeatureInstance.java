package org.student.featureswitcher;

import java.lang.reflect.InvocationTargetException;

public class FeatureInstance {

  public static Feature<?> get(String classPath) {
    Feature<?> f = null;
    try {
      f = (Feature<?>) ClassLoader
          .getSystemClassLoader()
          .loadClass(classPath)
          .getConstructor()
          .newInstance();
    } catch (Exception ignored) {}
    return f;
  }
}
