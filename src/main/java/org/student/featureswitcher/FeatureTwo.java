package org.student.featureswitcher;

import org.student.featureswitcher.Feature;

public class FeatureTwo implements Feature<Integer> {

  @Override
  public Integer process() {
    return 2;
  }
}
