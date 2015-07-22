package partha.explorer.service;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import partha.explorer.manager.RegistrationManager;
import static partha.explorer.manager.RegistrationManager.checkDuplicate;
import partha.explorer.utils.ApplicationConstant;

/**
 *
 * @author Partha
 */
public class RegistrationService extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String userMap = request.getParameter("userMap");
            String userName = request.getParameter("userName");

            if (checkDuplicate(userName)) {
                String id = new RegistrationManager().firstRegister(userMap);

                if (id != null && !id.equals("")) {
                    out.write(new Gson().toJson(id));
                } else {
                    out.write(new Gson().toJson(ApplicationConstant.HTTP_STATUS_FAIL));
                }
            } else {
                out.write(new Gson().toJson("User Name Already exists"));
            }

        } catch (Exception ex) {
            out.write(new Gson().toJson(ApplicationConstant.ERROR));
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
