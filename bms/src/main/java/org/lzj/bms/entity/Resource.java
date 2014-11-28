package org.lzj.bms.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *权限资源
 *
 */
@Entity
@Table(name="bms_resource")
public class Resource implements Serializable{

	private static final long serialVersionUID = 7228754003731692612L;
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(unique = true, nullable = false)
	private String resourceName;
	
	@Column(unique = true, nullable = false)
	private String resourceUri;
	
	private Date createDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceUri() {
		return resourceUri;
	}
	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return resourceName + "_" + resourceUri;
	}
}
