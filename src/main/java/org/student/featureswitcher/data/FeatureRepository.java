package org.student.featureswitcher.data;

public interface FeatureRepository extends Repository<String, Feature> {

  Feature findById(String id);

  Feature save(Feature entity);

  void deleteById(String id);

  void delete(Feature entity);
}
