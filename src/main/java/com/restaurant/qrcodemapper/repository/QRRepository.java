package com.restaurant.qrcodemapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.qrcodemapper.model.QRCode;

public interface QRRepository extends JpaRepository<QRCode, Integer>
{
	//QRCode findByUUID(String uuid);
}
