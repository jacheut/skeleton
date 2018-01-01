package cn.skele.web;

import cn.skele.business.IUserBusiness;
import cn.skele.model.po.User;
import cn.skele.model.vo.ResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
	public ResponseVo getUser(HttpServletRequest request){
		return new ResponseVo(userBusiness.getUserById(1));
	}

	@RequestMapping("/manager/login")
	@ResponseBody
	public ResponseVo login(HttpServletRequest request){
		return new ResponseVo(userBusiness.getUserById(1));
	}
}
