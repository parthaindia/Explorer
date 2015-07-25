package partha.explorer.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import partha.explorer.manager.RegistrationManager;
import partha.explorer.utils.ApplicationConstant;

/**
 *
 * @author Partha
 */
public class UpdateRequestService extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String userMap = request.getParameter("userMap");
            String userId = request.getParameter("userId");

            HashMap map = new Gson().fromJson(userMap, new TypeToken<HashMap>() {
            }.getType());
            boolean output = new RegistrationManager().updateUser(userId, map);
            if (output) {
                out.write(new Gson().toJson(ApplicationConstant.HTTP_STATUS_SUCCESS));
            } else {
                out.write(new Gson().toJson(ApplicationConstant.HTTP_STATUS_FAIL));
            }

        } catch (Exception ex) {
            request.setAttribute("statuscode", ApplicationConstant.HTTP_STATUS_EXCEPTION);
            out.write(new Gson().toJson(ApplicationConstant.HTTP_STATUS_EXCEPTION));
            StringWriter stack = new StringWriter();
            ex.printStackTrace(new PrintWriter(stack));
        } finally {
            out.close();
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
