package com.deloitte.estore.application;



import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



import com.deloitte.estore.model.Product;

import com.deloitte.estore.service.ProductService;

import com.deloitte.estore.service.ProductServiceImpl;



/**

 * Servlet implementation class AddProductController

 */

@WebServlet("/update")

public class UpdateController1 extends HttpServlet {

	private static final long serialVersionUID = 1L;



	/**

	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	  int prodId=Integer.parseInt(request.getParameter("pid"));
//	  String prodName=request.getParameter("txtpname");
//	  Float price=Float.parseFloat(request.getParameter("txtprice"));
//	  

	 

	  ProductService ps=new ProductServiceImpl();
	 
	  try {
		  Product p=ps.getProductById(prodId);
		request.getSession().setAttribute("product",p);
		response.sendRedirect("update1.jsp");
	 

			

	} catch (Exception e) {

	

		e.printStackTrace();
	}
}
}

	



