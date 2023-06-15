package com.example.consultations.servlets;

import com.example.consultations.entities.Patient;
import com.example.consultations.services.PatientService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "allPatients", value = "/allPatients")
public class allPatientsServlet extends HttpServlet {
    private PatientService ps;

    public void init() {
        ps = new PatientService();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("id") != null) {
            int id = Integer.parseInt((request.getParameter("id")));
            Patient patient = (Patient) ps.findById(id);
            request.setAttribute("patient", patient);
            request.getRequestDispatcher("/WEB-INF/views/patientDetail.jsp").forward(request, response);

        } else {
            List<Patient> patients = ps.SelectAll();
            request.setAttribute("patients", patients);
            request.getRequestDispatcher("/WEB-INF/views/patients.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
