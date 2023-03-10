package com.abdullah.todoapp.ping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PingController {
	
	// http://localhost:8080/ping
	@RequestMapping("ping")
	@ResponseBody
	public String ping() {
		return "pong!";
	}
	
	// http://localhost:8080/ping-html
	@RequestMapping("ping-html")
	@ResponseBody
	public StringBuffer pingHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Status of application</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("pong!");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb;
	}

	// /src/main/resources/META-INF/resources/WEB-INF/jsp/ping.jsp
	// http://localhost:8080/ping-jsp
	@RequestMapping("ping-jsp")
	public String pingJsp() {
		return "ping";
	}

}
