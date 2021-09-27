package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.Flipkart;


public class StatargyDpTest {

	public static void main(String[] args) {
		//create ioc container having loaded xml file
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		//load xml file
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		//get target class obj
		Flipkart flipkart=factory.getBean("flipkart",Flipkart.class);
		//call sopping method
		String status=flipkart.shopping(new String[] {"t-sharts","pants","Jeans"}, new double[] {1000.0f,2000.0f,3000.0f});
		//print status
		System.out.println(status);
	}

}
