package com.example.scg.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        // 매개변수로 전달되어있는 라우트 객체에다가 path정보를 등록
        return builder.routes()
                //first-service라는 값이 요청이 오면,
                .route(r -> r.path("/first-service/**")
                        //필터 적용해서, 필터 객체에 request header를 추가해서(key-value)
                        .filters(f -> f.addRequestHeader("first-request", "first-request-header")
                                //response Header 반환
                                .addResponseHeader("first-response", "first-response-header"))
                        //uri로 이동
                        .uri("http://localhost:8081"))
                .route(r -> r.path("/second-service/**")
                        //필터 적용해서, 필터 객체에 request header를 추가해서(key-value)
                        .filters(f -> f.addRequestHeader("second-request", "second-request-header")
                                //response Header 반환
                                .addResponseHeader("second-response", "second-response-header"))
                        //uri로 이동
                        .uri("http://localhost:8082"))
                .build();
    }
}
