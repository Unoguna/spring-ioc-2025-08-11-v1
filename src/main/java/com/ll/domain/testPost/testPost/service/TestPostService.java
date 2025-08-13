package com.ll.domain.testPost.testPost.service;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //final이나 @NonNull이 붙은 필드를 대상으로 자동으로 생성자를 만들어주는 기능
public class TestPostService {
    private final TestPostRepository testPostRepository;
}
