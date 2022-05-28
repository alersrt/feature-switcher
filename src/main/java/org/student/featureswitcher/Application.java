package org.student.featureswitcher;

import java.util.HashMap;
import java.util.Map;

public class Application {

  public static void main(String[] args) {
    Map<Integer, String> storage = Map.of(
        1, "org.student.featureswitcher.FeatureOne",
        2, "org.student.featureswitcher.FeatureTwo"
    );

    System.out.println(FeatureInstance.get(storage.get(1)).process());
    System.out.println(FeatureInstance.get(storage.get(2)).process());
  }
}
