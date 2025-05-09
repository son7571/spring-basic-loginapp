package com.example.loginapp._core.interceptor;

import com.example.loginapp.user.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        System.out.println("uri: " + uri);

        HttpSession session = request.getSession(false);
        User sessionUser = (session == null) ? null : (User) session.getAttribute("sessionUser");


        if (uri.equals("/") || uri.equals("/home") || uri.equals("/index")) {
            if (sessionUser == null) {
                session.setAttribute("msg", "로그인이 필요합니다");
                response.sendRedirect("/login-form");
                return false;
            }
        }
        return true;
    }
}