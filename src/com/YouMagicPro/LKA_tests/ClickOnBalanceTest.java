package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnBalanceTest extends TestBaseReg{
	@Test
public void clickOnBalanceTest () throws Exception {	 
		openAndLogin();
		selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		selenium.click("css=span.modal_cansel_button_text");
		
		selenium.click("css=a.mGray2.active"); //���� �� ������������-�������.
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ��������")); //���������, ��� �� �������� �������� ���� �����  ���������� �������� �
	 }

}