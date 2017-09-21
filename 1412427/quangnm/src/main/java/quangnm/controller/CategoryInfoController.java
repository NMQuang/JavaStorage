package quangnm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fasterxml.jackson.databind.ObjectMapper;

import quangnm.entity.Category;
import quangnm.util.HibernateUtil;

@WebServlet("/changeList")
public class CategoryInfoController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		Session session = HibernateUtil.openSession();
		session.beginTransaction();
		Category category = (Category) session.get(Category.class, id);
		session.close();

		// response.setCharacterEncoding("utf8");
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(category);
		resp.getWriter().write(json);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String type = req.getParameter("type");
		Session session = HibernateUtil.openSession();
		Transaction transaction = session.beginTransaction();
		Category category;
		switch (type) {
		case "delete":
			try {
				session.delete(session.get(Category.class, id));
				transaction.commit();
			} catch (Exception e) {
				transaction.rollback();
			} finally {
				session.close();
			}
			break;
		case "insert":
			category = new Category();
			category.setName(req.getParameter("name"));
			category.setBrand(req.getParameter("brand"));
			System.out.println(category.getName());
			break;
		case "update":
			category = new Category();
			category.setName(req.getParameter("name"));
			category.setBrand(req.getParameter("brand"));
			System.out.println(category.getName());
			break;
		}
		
	}
}
