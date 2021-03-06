package com.xiangyang.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

public class DepartmentDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * This field corresponds to the database column mona_department.department_id
     */
    private Long departmentId;

    /**
     * This field corresponds to the database column mona_department.department_father_id
     */
    private Long departmentFatherId;

    /**
     * This field corresponds to the database column mona_department.department_level
     */
    private Integer departmentLevel;

    /**
     * This field corresponds to the database column mona_department.department_name
     */
    private String departmentName;

    /**
     * This field corresponds to the database column mona_department.gmt_create
     */
    private Date gmtCreate;

    /**
     * This field corresponds to the database column mona_department.gmt_modified
     */
    private Date gmtModified;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getDepartmentFatherId() {
		return departmentFatherId;
	}

	public void setDepartmentFatherId(Long departmentFatherId) {
		this.departmentFatherId = departmentFatherId;
	}

	public Integer getDepartmentLevel() {
		return departmentLevel;
	}

	public void setDepartmentLevel(Integer departmentLevel) {
		this.departmentLevel = departmentLevel;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}


    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}