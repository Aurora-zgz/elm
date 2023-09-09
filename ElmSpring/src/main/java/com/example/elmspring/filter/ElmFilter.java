package com.example.elmspring.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: Filter
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/12 16:54
 * @Version: 1.0
 **/

@WebFilter(filterName = "ElmFilter", urlPatterns="/*")
public class ElmFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        HttpServletResponse res = (HttpServletResponse) response;
        //注意：这里设置只允许http://localhost:5500进行跨域访问
        res.setHeader("Access-Control-Allow-Origin", "*");
        res.setHeader("Access-Control-Allow-Credentials", "true");
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        res.setHeader("Access-Control-Max-Age", "3628800");
        res.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        //post请求中含参传值，允许content-type
        res.setHeader("Access-Control-Allow-Headers", "content-type");
        chain.doFilter(request, response);
    }
}