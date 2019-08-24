package com.newer.p2p.config;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.newer.p2p.Util.JwtTokenUtil;
import com.newer.p2p.domain.ResponseData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 自定义的拦截器
 */
@Component
public class MyInterceptor implements HandlerInterceptor {

    @Value("${auth.header}")
    private String header;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入preHandle的方法");
        try {
            String token = request.getHeader(header);
            if (token != null) {
                String username = jwtTokenUtil.getUsernameByToken(token);
                if (username != null) { //用户已登录
                    return true;
                } else {
                    //用户未登录
                    responseMsg(response);
                    return false;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            responseMsg(response);
        }
        responseMsg(response);
        return false;
    }

    //响应输出错误信息
    private void responseMsg(HttpServletResponse response){
        try{
            response.setContentType("application/json;charset=utf-8");
            PrintWriter out = response.getWriter();
            ResponseData responseData = new ResponseData("403","fobidden");
            ObjectMapper objectMapper = new ObjectMapper();
            String strData = objectMapper.writeValueAsString(responseData);
            out.print(strData);
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }



    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("进入了postHanle的方法中......");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("进入了afterCompletion的方法....");
    }
}
