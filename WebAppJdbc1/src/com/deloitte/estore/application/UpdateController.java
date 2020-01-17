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

@WebServlet("/update1")

public class UpdateController extends HttpServlet {

	private static final long serialVersionUID = 1L;



	/**

	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	  int prodId=Integer.parseInt(request.getParameter("pid"));
	  String prodName=request.getParameter("txtpname");
	  Float price=Float.parseFloat(request.getParameter("txtprice"));
	  

	 

	  ProductService ps=new ProductServiceImpl();
	  Product p=new Product(prodId,prodName,price);
	  try {
		  //p=ps.getProductById(prodId);
		if(ps.updateProduct(p)) {

			response.sendRedirect("getall");

		}
		else
		{
			response.sendRedirect("error.jsp");	
		}
		
	 

			

	} catch (Exception e) {

	

		e.printStackTrace();
	}
}
}

	



