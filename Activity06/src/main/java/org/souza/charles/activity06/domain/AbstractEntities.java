package org.souza.charles.activity06.domain;
/*
Subject title: Programming for the Web III
Lecturer: Prof. Dr. Fernando Vernal Salina
Example adapted by: Charles Fernandes de Souza
Date: March 31, 2022
*/
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntities<ID extends Serializable> implements Serializable{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntities<?> that = (AbstractEntities<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
