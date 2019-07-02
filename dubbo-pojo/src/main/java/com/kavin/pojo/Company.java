package com.kavin.pojo;

import java.io.Serializable;

/**
 *  企业实体类
 * @author Kavin
 *
 */
public class Company implements Serializable{

	private String CompanyId;
	private String CompanyName;
	@Override
	public String toString() {
		return "Company [CompanyId=" + CompanyId + ", CompanyName=" + CompanyName + ", CompanyAddress=" + CompanyAddress
				+ "]";
	}
	public String getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(String companyId) {
		CompanyId = companyId;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCompanyAddress() {
		return CompanyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		CompanyAddress = companyAddress;
	}
	private String CompanyAddress;
	
}
