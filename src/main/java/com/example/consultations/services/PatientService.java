package com.example.consultations.services;

import com.example.consultations.entities.Patient;
import com.example.consultations.interfaces.Repository;
import org.hibernate.query.Query;

import java.util.List;

public class PatientService extends BaseService implements Repository {
    public PatientService() { super();
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
        Patient patient = null;
        session = sessionFactory.openSession();
        patient = (Patient) session.get(Patient.class, id);
        session.close();
        return patient;
    }

    @Override
    public List SelectAll() {
        session = sessionFactory.openSession();
        Query<Patient> patientQuery = session.createQuery("from Patient");
        List<Patient> patients = patientQuery.list();
        session.close();
        return patients;
    }
}
