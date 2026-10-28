package org.example.data;

import java.util.List;

public interface DAO<T> {
    T findById(Long id);
    List<T> findAll();

    T save(T entity);
    void deleteById(Long id);
    void update(T entity);
}
