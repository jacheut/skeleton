package cn.skele.web;

import cn.skele.business.IUserBusiness;
import cn.skele.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/demo")
public class DemoController {
	private static final Logger log = LoggerFactory.getLogger(DemoController.class);
	
	@Resource
	private IUserBusiness userBusiness;
	
	/**
	 *
	 */
	@RequestMapping("/test")
	@ResponseBody
	public User getUser(HttpServletRequest request){
		return userBusiness.getUserById(1);
	}
}
