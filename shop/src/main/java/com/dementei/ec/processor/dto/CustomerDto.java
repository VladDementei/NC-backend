package com.dementei.ec.processor.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private String email = "";
    private String surname = "";
    private String name = "";
    private String patronymic = "";
    private int age = 0;
}