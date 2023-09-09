package com.example.elmspring.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: WebConfig
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2021/8/31 19:12
 * @Version: 1.0
 **/
//拦截器对应的配置类
@Configuration
public class WebConfig implements WebMvcConfigurer {
// @Override
//     public void addInterceptors(InterceptorRegistry registry) {
//         registry.addInterceptor(new LoginInterceptor())
//             .addPathPatterns("/**") //所有路径都被拦截
//             .excludePathPatterns(    //添加不拦截路径
//                 "/login",                    //登录路径
//                 "/**/*.html",                //html静态资源
//                 "/**/*.js",                  //js静态资源
//                 "/**/*.css"                  //css静态资源
//         );
//     }
}
