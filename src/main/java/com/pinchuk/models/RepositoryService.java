package com.pinchuk.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RepositoryService {

    private final SessionFactory sessionFactory;

    @Autowired
    public RepositoryService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Singer singer = new Singer();
//        singer.setName("Rich");
//        Session currentSession = sessionFactory.getCurrentSession();
//        currentSession.save(singer);
//    }

}
