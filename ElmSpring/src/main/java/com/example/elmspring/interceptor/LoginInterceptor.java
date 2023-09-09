package com.example.elmspring.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @ClassName: LoginInterceptor
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2021/8/31 19:08
 * @Version: 1.0
 **/
//对网页进行过滤拦截，防止不登录就可以直接访问
public class LoginInterceptor implements HandlerInterceptor {
 /*   @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user =(User)request.getSession().getAttribute("user");
        System.out.println(user.getName());
        if(user == null){
            response.sendRedirect("/loginPage");
            return false;
        }
        return true;
    }*/
}
