package org.student.featureswitcher;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Feature")
class FeatureInstanceTest {

  @DisplayName("type: String; value: 1st")
  @Test
  void get1st() throws
      ClassNotFoundException,
      InvocationTargetException,
      NoSuchMethodException,
      InstantiationException,
      IllegalAccessException
  {
    /*------ Arranges ------*/
    String pathOne = "org.student.featureswitcher.FeatureOne";

    /*------ Actions ------*/
    var feature = FeatureInstance.get(pathOne);
    var result = feature.process();

    /*------ Asserts ------*/
    Assertions.assertThat(result).isInstanceOf(String.class).isEqualTo("1st");
  }

  @DisplayName("type: Integer; value: 2")
  @Test
  void get2nd() throws
      ClassNotFoundException,
      InvocationTargetException,
      NoSuchMethodException,
      InstantiationException,
      IllegalAccessException
  {
    /*------ Arranges ------*/
    String pathTwo = "org.student.featureswitcher.FeatureTwo";

    /*------ Actions ------*/
    var feature = FeatureInstance.get(pathTwo);
    var result = feature.process();

    /*------ Asserts ------*/
    Assertions.assertThat(result).isInstanceOf(Integer.class).isEqualTo(2);
  }
}