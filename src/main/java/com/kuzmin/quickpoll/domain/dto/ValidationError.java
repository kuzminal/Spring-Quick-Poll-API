package com.kuzmin.quickpoll.domain.dto;

import lombok.Data;

@Data
public class ValidationError {
    private String code;
    private String message;
}
