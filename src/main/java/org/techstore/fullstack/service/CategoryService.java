package org.techstore.fullstack.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.techstore.fullstack.repository.CategoryRepository;
import org.techstore.fullstack.web.request.CategoryRequest;
import org.techstore.fullstack.web.response.CategoryResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
}
