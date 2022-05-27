package org.student.featureswitcher;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.student.featureswitcher.data.Feature;
import org.student.featureswitcher.data.FeatureRepository;
import org.student.featureswitcher.data.InMemoryFeatureRepository;

public class Application {

  public static void main(String[] args) throws
      ClassNotFoundException,
      NoSuchMethodException,
      InvocationTargetException,
      InstantiationException,
      IllegalAccessException
  {
    FeatureRepository repository = new InMemoryFeatureRepository();

    var f1 = repository.save(new Feature("org.student.featureswitcher.feature.FeatureOne"));
    var f2 = repository.save(new Feature("org.student.featureswitcher.feature.FeatureTwo"));

    var obj1 = (org.student.featureswitcher.feature.Feature) ClassLoader
        .getSystemClassLoader()
        .loadClass(f1.classPath())
        .getConstructor()
        .newInstance();
    var obj2 = (org.student.featureswitcher.feature.Feature) ClassLoader
        .getSystemClassLoader()
        .loadClass(f2.classPath())
        .getConstructor()
        .newInstance();

    obj1.process();
    obj2.process();
  }
}
