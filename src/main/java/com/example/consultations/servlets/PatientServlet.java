package com.example.consultations.servlets;

import com.example.consultations.entities.Patient;
import com.example.consultations.services.PatientService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "addpatient", value = "/addpatient")
public class PatientServlet extends HttpServlet {
    private PatientService ps;

    public void init() {
        ps = new PatientService();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if(request.getParameter("lastname") != null) {
            String lastname = request.getParameter("lastname");
            String firstname = request.getParameter("firstname");
            String phone = request.getParameter("phone");
            if(ps.create(new Patient(lastname, firstname, phone))) {
                response.sendRedirect("index.jsp");
            }
        }else {

        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/views/createPatient.jsp").forward(request, response);
    }
    public void destroy() {

    }

}
