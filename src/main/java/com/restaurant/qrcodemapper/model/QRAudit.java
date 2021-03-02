package com.restaurant.qrcodemapper.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value= {"created_at,updated_at"}, allowGetters=true)

public class QRAudit 
{
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at", nullable=false, updatable=false)
	@CreatedDate
	private Date createdDate;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at", nullable=false)
	@CreatedDate
	private Date updatedAt;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_by", nullable=false)
	@CreatedDate
	private Date createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_by", nullable=false)
	@CreatedDate
	private Date updatedBy;
	
}
