package com.smartgreen.course.auth;


import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;

import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Stateless
@Transactional
public class AuthService {
    @PersistenceContext(unitName = "course")
    private EntityManager entityManager;

    public String createUser(User user){
        user.setPassword(user.getPassword());
        entityManager.persist(user);
        
        return "Success created user";
    }

}
