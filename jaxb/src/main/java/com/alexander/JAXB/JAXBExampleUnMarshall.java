package main.java.com.alexander.JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBExampleUnMarshall {

	public static void main(String[] args) {
		 try {
			 
				File file = new File("C:\\file.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		 
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
				System.out.println(customer.toString());
		 
			  } catch (JAXBException e) {
				e.printStackTrace();
			  }
		 
			}

}