package ch08;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mcontrol")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	MemberService service;

	// 서블릿 초기화 메서드
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
    	service = new MemberService();
	}

	// HTTP 요청 처리 메서드
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action"); // 클라이언트로부터 전달된 action 파라미터 값을 가져옴
		String view = "";

		if(action == null) { // action이 null일 경우 기본 처리
			getServletContext().getRequestDispatcher("/mcontrol?action=list").forward(request, response); // action=list로 리디렉션
		} else {
			// action 값에 따른 처리 분기
			switch(action) {
			case "list": view = list(request, response);break; // list 요청 처리
			case "info": view = info(request, response);break; // info 요청 처리
			}
			getServletContext().getRequestDispatcher("/ch08/"+view).forward(request, response);  // 요청 처리 후 해당 뷰로 포워딩
		}
	}

	// 회원 목록 조회 메서드
	private String list(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("members", service.findAll()); // 모든 회원 정보 조회
		return "memberList.jsp"; // 모든 회원 정보 조회
	}
	
	// 회원 정보 조회 메서드
	private String info(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("m", service.find(request.getParameter("id"))); // 회원 정보 조회
		return "memberInfo.jsp"; // 회원 정보 뷰 페이지 반환
	}
	
}
