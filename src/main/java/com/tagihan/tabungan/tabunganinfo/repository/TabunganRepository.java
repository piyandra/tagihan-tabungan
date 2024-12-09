package com.tagihan.tabungan.tabunganinfo.repository;

import com.tagihan.tabungan.tabunganinfo.entity.Tabungan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TabunganRepository extends JpaRepository<Tabungan, String>, JpaSpecificationExecutor<Tabungan> {
}
