package com.example.consultations.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDate date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "prescription_id")
    private Prescription prescription;

    @OneToOne
    @JoinColumn(name = "treatment_id")
    private Treatment treatment;

    public Consultation() {
    }

    public Consultation(LocalDate date, Patient patient, Prescription prescription, Treatment treatment) {
        this.date = date;
        this.patient = patient;
        this.prescription = prescription;
        this.treatment = treatment;
    }

    public Consultation(LocalDate date, Patient patient) {
        this.date = date;
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", date=" + date +
                ", patient=" + patient +
                ", prescription=" + prescription +
                ", treatment=" + treatment +
                '}';
    }
}
