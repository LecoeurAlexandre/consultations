package com.example.consultations.servlets;

import com.example.consultations.entities.Consultation;
import com.example.consultations.entities.Patient;
import com.example.consultations.services.ConsultationService;
import com.example.consultations.services.PatientService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "createConsultation", value = "/createConsultation")
public class createConsultationServlet extends HttpServlet {
    private ConsultationService cs;
    private PatientService ps;

    public void init() {
        cs = new ConsultationService();
        ps = new PatientService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("id") != null) {
            int id = Integer.parseInt((request.getParameter("id")));
            Patient patient = (Patient) ps.findById(id);
            LocalDate ld = LocalDate.now();
            if(cs.create(new Consultation(ld, patient))) {
                response.sendRedirect("index.jsp");
            }
        } else if (request.getParameter("consultId") != null) {
            int consultId = Integer.parseInt((request.getParameter("consultId")));
            Consultation consult = (Consultation) cs.findById(consultId);
            request.setAttribute("consultation", consult);
            request.getRequestDispatcher("/WEB-INF/views/consultationDetail.jsp").forward(request, response);
        }
    }
}
