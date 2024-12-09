package com.tagihan.tabungan.tabunganinfo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tabungan")
public class Tabungan {

    @Column(name = "kantor")
    private String office;

    @Column(name = "produk")
    private String product;

    private String cif;

    @Id
    private String account;

    private String name;
    @Column(name = "alamat")
    private String address;

    @Column(name = "saldo")
    private BigInteger balance;

    @Column(name = "transaksi")
    private BigInteger trans;

    @Column(name = "ao")
    private String accountOfficer;

    @Column(name = "no_hp")
    private String telp;

}
