package com.cn.hnust.controller;  
  
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import com.cn.hnust.tool.LoggerFactory;
  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
	protected static Logger logger = LoggerFactory.getLogger();
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String showUser(HttpServletRequest request,Model model){  
        String userId = request.getParameter("id");  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);
        logger.error(user.getUserName());
        return "showUser";  
    }
    @RequestMapping("/login")
    public String login(User user,Model model){
    	user = this.userService.findUser(user);
    	
    	model.addAttribute("user", user);
    	logger.info(user.getUserImg());
    	return "index";
    }
    
}  