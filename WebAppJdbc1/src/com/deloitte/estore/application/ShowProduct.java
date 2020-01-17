package com.deloitte.estore.application;



import java.io.IOException;

import java.util.List;



import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;



import com.deloitte.estore.model.Product;

import com.deloitte.estore.service.ProductService;

import com.deloitte.estore.service.ProductServiceImpl;



/**

 * Servlet implementation class GetAllProductsController

 */

@WebServlet("/searchproduct")

public class ShowProduct extends HttpServlet {

	private static final long serialVersionUID = 1L;



	/**

	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		int prodId=Integer.parseInt(request.getParameter("pid"));
		ProductService ps=new ProductServiceImpl();
		
		try {
			Product p=ps.getProductById(prodId);
			HttpSession ssn=request.getSession();

			ssn.setAttribute("products",p);
			
			response.sendRedirect("showproduct.jsp");
			
		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}



}