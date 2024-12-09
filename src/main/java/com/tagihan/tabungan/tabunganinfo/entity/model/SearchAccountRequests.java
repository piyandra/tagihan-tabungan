package com.tagihan.tabungan.tabunganinfo.entity.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchAccountRequests<T>{

    private T data;

    private String error;
}
