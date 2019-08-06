package com.pinchuk;

import com.pinchuk.models.Singer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class SingerDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public SingerDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Singer singer) {
        sessionFactory.getCurrentSession().saveOrUpdate(singer);
    }

    public Singer findById(int id) {
        return sessionFactory.getCurrentSession().find(Singer.class, id);
    }

    public List<Singer> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Singer's").list();
    }

}
