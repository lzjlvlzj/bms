package org.lzj.bms.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bms_role")
public class Role implements Serializable {
	
	private static final long serialVersionUID = 4894365348605664246L;
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(unique = true, nullable = false)
	private String roleName;
	
	@Column(unique = true, nullable = false)
	private String roleValue;
	
	@Column(nullable = false)
	private Date createTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getRoleValue() {
		return roleValue;
	}
	public void setRoleValue(String roleValue) {
		this.roleValue = roleValue;
	}
	
	@Override
	public String toString() {
		return roleName + "_" + roleValue; 
	}

}
