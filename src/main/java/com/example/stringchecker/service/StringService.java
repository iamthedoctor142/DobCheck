package com.example.stringchecker.service;

import com.example.stringchecker.entity.StringData;
import com.example.stringchecker.repository.StringRepository;
import org.springframework.stereotype.Service;

@Service
public class StringService {

    private final StringRepository stringRepository;

    public StringService(StringRepository stringRepository) {
        this.stringRepository = stringRepository;
    }

    public String findNameByInputString(String inputString) {
        StringData data = stringRepository.findByInputString(inputString);
        return data != null ? data.getName() : "Name not found";
    }
}