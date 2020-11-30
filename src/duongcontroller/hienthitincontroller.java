package duongcontroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import duongbean.tintucbean;
import duongbo.tintucbo;

/**
 * Servlet implementation class hienthitincontroller
 */
@WebServlet("/hienthitincontroller")
public class hienthitincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hienthitincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    tintucbo ttbo=new tintucbo();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setCharacterEncoding("utf-8"); // lay du lieu len unicode
			response.setCharacterEncoding("utf-8");// gui du lieu ve unicode
			//request.setAttribute("dsloai", lbo.getloai());
			
			request.setAttribute("dstintuc",ttbo.getTinTuc());	
		
		//	String ml=request.getParameter("ml");
			String key=request.getParameter("txttk");
			ArrayList<tintucbean> dstintuc;
			
			if(key != null ) 
				dstintuc=ttbo.TimSachTheoTieuDe(key,key);
			else
				dstintuc=ttbo.getTinTuc();
			request.setAttribute("dstintuc", dstintuc);
			RequestDispatcher rd=request.getRequestDispatcher("hienthitin.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
