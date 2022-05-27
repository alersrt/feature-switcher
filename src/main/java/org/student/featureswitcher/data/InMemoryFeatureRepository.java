package org.student.featureswitcher.data;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryFeatureRepository implements FeatureRepository {

  private final Map<String, Feature> storage = new ConcurrentHashMap<>();

  public Feature findById(String id) {
    return storage.get(id);
  }

  public Feature save(Feature entity) {
    entity.setId(UUID.randomUUID().toString());
    storage.put(entity.id(), entity);
    return entity;
  }

  public void deleteById(String id) {
    if (id != null) {
      storage.remove(id);
    }
  }

  public void delete(Feature entity) {
    if (entity.id() != null) {
      storage.remove(entity.id());
    }
  }
}
