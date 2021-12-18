package com.bl.empwageuc11a13a14;

public interface IEmoWage {

	void addCompany(Company company);

	int getTotalWage(String companyName);

	Company getCompany(int index);

	Company getCompany(String companyName);

}
