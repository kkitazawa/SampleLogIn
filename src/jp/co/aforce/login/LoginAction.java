package jp.co.aforce.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.Accounts;
import jp.co.aforce.dao.AccountsDao;
import jp.co.aforce.tool.Action;


public class LoginAction extends Action{
	public String execute(
		HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		HttpSession session = request.getSession();
		
		String preId = request.getParameter("id");
		String password = request.getParameter("password");
		int id = Integer.parseInt(preId, 10);
		AccountsDao dao = new AccountsDao();
		Accounts accounts = dao.search(id, password);
		
		
		
		if(accounts != null) {
			session.setAttribute("accounts", accounts);
			return "login-out.jsp";
		}
		return "";
		
	
	}
}
