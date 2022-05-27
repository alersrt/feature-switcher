package org.student.featureswitcher.data;

public interface Repository<ID, T> {

  T findById(ID id);

  T save(T entity);

  void deleteById(ID id);

  void delete(T entity);
}
