	package com.YouMagicPro.LKS_tests;

	import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import com.registration.tests.TestBaseReg;


	public class PhoneAddGroupAndDeleteTest extends TestBaseReg{
		@Test
		public void  PhoneAddGroupAndDeleteTest_C15325_C15326 () throws Exception {	 
			openAndLoginLKS();
			selenium.click("link=������������� ��������");//������� �� ����� "������������� ��������" � ���� �������� �������
			Thread.sleep(3000);
			selenium.click("link=�������� ������");//������� �� ������ "�������� ������"
			Thread.sleep(3000);
			selenium.type("id=edit-group-name", "g1");//���� ����� ������ ("g1")
			selenium.click("id=edit-save");
			Thread.sleep(3000);
			selenium.click("//div[4]/input");//������
			Thread.sleep(3000);
			
			AssertJUnit.assertTrue(selenium.isTextPresent("g1"));//��������, ���� �� �� �������� ����� "g1"
			
			selenium.click("link=������������� ��������");//������� �� ����� "������������� ��������" � ���� �������� �������
			Thread.sleep(3000);
			selenium.click("//table[@id='contacts-overview']/tbody/tr[3]/td[2]/a[2]");
			Thread.sleep(9000);
			selenium.click("//div[4]/input");//������
			Thread.sleep(6000);
			
			AssertJUnit.assertFalse(selenium.isTextPresent("g1"));//��������, ���� �� �� �������� ����� "g1"
		}
	}