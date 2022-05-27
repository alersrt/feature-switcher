package org.student.featureswitcher.data;

public class Feature {

  private String id;
  private String classPath;

  public Feature(String classPath) {
    this.classPath = classPath;
  }

  public String id() {
    return id;
  }

  public Feature setId(String id) {
    this.id = id;
    return this;
  }

  public String classPath() {
    return classPath;
  }

  public Feature setClassPath(String classPath) {
    this.classPath = classPath;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Feature feature = (Feature) o;

    if (!id.equals(feature.id)) {
      return false;
    }
    return classPath.equals(feature.classPath);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + classPath.hashCode();
    return result;
  }
}
