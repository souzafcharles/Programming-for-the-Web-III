package org.souza.charles.activity08.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractDao<T,PK extends Serializable>{
    private final Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    @PersistenceContext
    private EntityManager entityManager;
    protected EntityManager getEntityManager(){}
    public void save(T entity){}
    public void update(T entity){}
    public void delete(PK id){}
    public List<T> findAll(){}
    public T findById(PK id){}
    protected List<T> createQuery(String jpql, Object... params){}
}
