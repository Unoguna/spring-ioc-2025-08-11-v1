package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.domain.testPost.testPost.service.TestPostService;

import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {
    private final Map<String, Object> beans = new HashMap<>();

    public ApplicationContext() {
        TestPostRepository repo = new TestPostRepository(); // 먼저 레포지토리 생성
        TestPostService service = new TestPostService(repo); // 의존성 주입
        beans.put("testPostRepository", repo);
        beans.put("testPostService", service);
    }

    public <T> T genBean(String beanName) {
        return (T) beans.get(beanName);
    }
}
