package org.student.featureswitcher;

import org.student.featureswitcher.Feature;

public class FeatureOne implements Feature<String> {

  @Override
  public String process() {
    return "1st";
  }
}
