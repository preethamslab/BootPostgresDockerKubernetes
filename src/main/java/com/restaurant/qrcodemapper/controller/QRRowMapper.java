package com.restaurant.qrcodemapper.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.restaurant.qrcodemapper.model.QRCode;

public class QRRowMapper implements RowMapper<QRCode> 
{

	@Override
	public QRCode mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		QRCode qrc = new QRCode();
		qrc.setId(rs.getInt("id"));
		qrc.setUuid(rs.getString("uuid"));
		qrc.setType(rs.getString("type"));
		qrc.setUrl(rs.getString("url"));
		return qrc;
	}
	
}
