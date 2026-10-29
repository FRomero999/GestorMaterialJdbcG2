package org.example.data;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    Optional<T> findById(Long id);
    List<T> findAll();

    T save(T entity);
    void deleteById(Long id);
    void update(T entity);
}
