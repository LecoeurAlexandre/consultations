package com.example.consultations.services;

import com.example.consultations.entities.Consultation;
import com.example.consultations.entities.Patient;
import com.example.consultations.interfaces.Repository;

import java.util.List;

public class ConsultationService extends BaseService implements Repository {
    public ConsultationService() { super();
    }
    @Override
    public boolean create(Object o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Object o) {
        return false;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public Object findById(int id) {
        Consultation consultation = null;
        session = sessionFactory.openSession();
        consultation = (Consultation) session.get(Consultation.class, id);
        session.close();
        return consultation;
    }

    @Override
    public List SelectAll() {
        return null;
    }
}
