package org.student.featureswitcher;

import java.lang.reflect.InvocationTargetException;

public class FeatureInstance {

  public static Feature<?> get(String classPath) throws
      ClassNotFoundException,
      NoSuchMethodException,
      InvocationTargetException,
      InstantiationException,
      IllegalAccessException
  {
    return (Feature<?>) ClassLoader
        .getSystemClassLoader()
        .loadClass(classPath)
        .getConstructor()
        .newInstance();
  }
}
