package com.tagihan.tabungan.tabunganinfo.entity.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SearchAccountResponse {

    private String name;

    private String account;

}
