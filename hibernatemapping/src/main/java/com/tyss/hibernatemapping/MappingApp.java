package com.tyss.hibernatemapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.tyss.hibernatemapping.dto.EmployeeAddressInfoBean;
import com.tyss.hibernatemapping.dto.EmployeeAddressPKBean;
import com.tyss.hibernatemapping.dto.EmployeeEducationPKBean;
import com.tyss.hibernatemapping.dto.EmployeeEducationalInfoBean;
import com.tyss.hibernatemapping.dto.EmployeeExpPKBean;
import com.tyss.hibernatemapping.dto.EmployeeExperienceInfoBean;
import com.tyss.hibernatemapping.dto.EmployeeInfoBean;
import com.tyss.hibernatemapping.dto.EmployeeOtherInfoBean;

public class MappingApp {

	public static void main(String[] args) throws ParseException {

		// Employee_info_Bean
		EmployeeInfoBean bean = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date joiningDate = format.parse("2002-04-23");
		Date dobDate = format.parse("1993-03-12");
		bean.setId(195);
		bean.setName("elseone");
		bean.setAge(55);
		bean.setAccountNumber(6666);
		bean.setDepartmentId(2);
		bean.setDesignation("analyst");
		bean.setDob(dobDate);
		bean.setJoiningDate(joiningDate);
		bean.setEmail("naruto111@gmail.com");
		bean.setGender("male");
		bean.setManagerId(106);
		bean.setSalary(34000);
		bean.setPhone(9875535);

		// employee_other_info bean
		EmployeeOtherInfoBean empOtherInf = new EmployeeOtherInfoBean();

		empOtherInf.setAdhar(54532121);
		empOtherInf.setBloodGroup("A+");
		empOtherInf.setEmergencyContactNumber(911);
		empOtherInf.setEmergencyContactPerson("minato");
		empOtherInf.setFatherName("kushina");
		empOtherInf.setIschallenged(false);
		empOtherInf.setMarried(false);
		empOtherInf.setMotherName("alex");
		empOtherInf.setNationality("japanese");
		empOtherInf.setReligion("christian");
		empOtherInf.setSpouseName("hello");

		empOtherInf.setInfoBean(bean);

		EmployeeAddressPKBean addressPKBean = new EmployeeAddressPKBean();
		addressPKBean.setAddressType("Temporary");
		addressPKBean.setInfoBean(bean); // addr1 for same employee

		EmployeeAddressPKBean addressPKBean2 = new EmployeeAddressPKBean();
		addressPKBean2.setAddressType("Permanent");
		addressPKBean2.setInfoBean(bean);// addr2 for same employee

		EmployeeAddressInfoBean addressInfoBean = new EmployeeAddressInfoBean();
		addressInfoBean.setAddressPkBean(addressPKBean);
		addressInfoBean.setAddress1("a");
		addressInfoBean.setAddress2("b");
		addressInfoBean.setCity("ok");
		addressInfoBean.setCountry("india");
		addressInfoBean.setLandmark("above");
		addressInfoBean.setPincode(12345);
		addressInfoBean.setState("karnataka");

		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setAddressPkBean(addressPKBean2);
		addressInfoBean2.setAddress1("e");
		addressInfoBean2.setAddress2("c");
		addressInfoBean2.setCity("hleo");
		addressInfoBean2.setCountry("usa");
		addressInfoBean2.setLandmark("below");
		addressInfoBean2.setPincode(15432);
		addressInfoBean2.setState("new york");

		EmployeeEducationPKBean eduPkBean1 = new EmployeeEducationPKBean();
		eduPkBean1.setEducationType("BE");
		eduPkBean1.setInfoBean(bean);

		EmployeeEducationPKBean eduPkBean2 = new EmployeeEducationPKBean();
		eduPkBean2.setEducationType("mphil");
		eduPkBean2.setInfoBean(bean);

		EmployeeEducationalInfoBean educationalInfoBean = new EmployeeEducationalInfoBean();
		educationalInfoBean.setEmployeeEduPkBean(eduPkBean1);
		educationalInfoBean.setBranch("cs");
		educationalInfoBean.setCollegeName("kit");
		educationalInfoBean.setDegreeType("BACHELOR");
		educationalInfoBean.setLocation("blore");
		educationalInfoBean.setPercentage(67.6);
		educationalInfoBean.setUniversity("vtu");
		educationalInfoBean.setYop("2018");

		EmployeeEducationalInfoBean educationalInfoBean2 = new EmployeeEducationalInfoBean();
		educationalInfoBean2.setEmployeeEduPkBean(eduPkBean2);
		educationalInfoBean2.setBranch("cs");
		educationalInfoBean2.setCollegeName("kit");
		educationalInfoBean2.setDegreeType("Master");
		educationalInfoBean2.setLocation("blore");
		educationalInfoBean2.setPercentage(67.6);
		educationalInfoBean2.setUniversity("vtu");
		educationalInfoBean2.setYop("2022");

		EmployeeExpPKBean expPKBean1 = new EmployeeExpPKBean();
		expPKBean1.setCompanyName("AbC");
		expPKBean1.setInfoBean(bean);

		EmployeeExpPKBean expPKBean2 = new EmployeeExpPKBean();
		expPKBean2.setCompanyName("xyz");
		expPKBean2.setInfoBean(bean);

		EmployeeExperienceInfoBean experienceInfoBean = new EmployeeExperienceInfoBean();
		experienceInfoBean.setDesignation("dev");
		experienceInfoBean.setJoiningDate(joiningDate);
		experienceInfoBean.setLeavingDate(dobDate);
		experienceInfoBean.setEmpExpBean(expPKBean1);

		EmployeeExperienceInfoBean experienceInfoBean2 = new EmployeeExperienceInfoBean();
		experienceInfoBean2.setDesignation("tester");
		experienceInfoBean2.setJoiningDate(joiningDate);
		experienceInfoBean2.setLeavingDate(dobDate);
		experienceInfoBean2.setEmpExpBean(expPKBean2);

		HibernateImpl impl = new HibernateImpl();
		impl.createemployee(bean, empOtherInf, Arrays.asList(addressInfoBean, addressInfoBean2),
				Arrays.asList(educationalInfoBean, educationalInfoBean2),
				Arrays.asList(experienceInfoBean, experienceInfoBean2));

	}// end of main
}// end of class
