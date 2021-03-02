package com.restaurant.qrcodemapper.controller;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.qrcodemapper.model.QRCode;
import com.restaurant.qrcodemapper.repository.QRRepository;

@RestController
public class QRController 
{
	
	Logger logger= LoggerFactory.getLogger(QRController.class);
	
	 @Autowired
	 JdbcTemplate jdbcTemplate;
	
	@Autowired
	private QRRepository qrrepository;
	
	@GetMapping("/qrcode/uuid/{uuid}")
	private List<QRCode> getQRCode(@PathVariable int uuid)
	{
		//return qrrepository.findById(uuid);
		String query = "SELECT * FROM qrcode WHERE uuid ='%s'";
		query = String.format(query, uuid);
		List<QRCode> qrc = jdbcTemplate.query(
				  query, new QRRowMapper());
		
		return qrc;
	}
	
	@GetMapping("/qrcode/id/{id}")
	private Optional<QRCode> getQRCodebyid(@PathVariable int id)
	{
		return qrrepository.findById(id);

	}
	
	@GetMapping("/qrcode/getall")
	private List<QRCode> getAll()
	{
		return qrrepository.findAll();
		
				
	}
	
	
	  @PostMapping("/qrcode/create") 
	  private QRCode createQRCode(
			  @RequestBody QRCode qrObj) 
	  {
		  logger.info("logger object to sacve "+ qrObj);
		  return qrrepository.save(qrObj);
	  }
	 
 	
}
