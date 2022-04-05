package com.tan.medicalmanagement.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DataVO<T> {
    private Integer code;
    private String msg;
    private Long count;
    private List<T> data;
}
