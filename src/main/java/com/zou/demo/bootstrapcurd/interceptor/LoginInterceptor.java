package com.zou.demo.bootstrapcurd.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: 邹祥发
 * @date: 2021/6/12 10:53
 * 定义拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //获取请求的RUi:去除http:localhost:8081这部分剩下的
        String uri = request.getRequestURI();
        //URL:除了login和register是可以公开访问的，其他的URL都进行拦截控制
        if (uri.contains("/login") || uri.contains("/register")) {
            return true;
        }
        //获取session
        HttpSession session = request.getSession();
        Object user = session.getAttribute("loginUser");
        //判断session中是否有用户数据，如果有，则返回true，继续向下执行
        if (user != null) {
            return true;
        }
        //不符合条件的给出提示信息，并转发到登录页面
        request.setAttribute("msg", "您还没有登录，请先登录！");
        request.getRequestDispatcher("login").forward(request, response);
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

    }
}
