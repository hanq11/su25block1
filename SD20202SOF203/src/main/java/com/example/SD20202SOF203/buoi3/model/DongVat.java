package com.example.SD20202SOF203.buoi3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DongVat {
    private Integer id;
    private String ten;
    private Boolean gioiTinh; // false - cai, true - duc
    private Float giaTien;
}
