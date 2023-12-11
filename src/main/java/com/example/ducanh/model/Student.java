package com.example.ducanh.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="khachhang")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer makhachhang;
    private String tenkhachhang;
    private String sodienthoai;
    private String gioitinh;
    private String sinhnhat;
    private String diachi;
    private String email;
    private String chungminhthu;
    private String socancuoc;
    private String anhdaidien;
    private String trangthai;
    private int diemtichluy;
    private String hangkhachhang;
    private String nguoigioithieu;


}
