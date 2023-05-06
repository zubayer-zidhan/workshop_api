package com.workshop_api.workshop_api.generator;


import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Component
public class UserIdGenerator implements IdentifierGenerator {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        Query query = entityManager.createNativeQuery("SELECT MAX(id) FROM users");
        Object result = query.getSingleResult();
        int id = 1;
        if (result != null) {
            id = Integer.parseInt(result.toString()) + 1;
        }
        return id;
    }
    
}
