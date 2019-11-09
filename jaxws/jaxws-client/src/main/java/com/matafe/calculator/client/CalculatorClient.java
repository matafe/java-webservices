package com.matafe.calculator.client;

/**
 * Calculator Client. (Consumer)
 * 
 * @author matafe@gmail.com
 */
public class CalculatorClient {

    public static void main(String[] args) throws Exception {

	//URL url = new URL(Publisher.URI_CALC + "?wsdl");
	//QName qname = new QName("http://calculator.matafe.com/", "CalculatorService");
	//Service service = Service.create(url, qname);

	//Calculator wsService = service.getPort(Calculator.class);

	// remote call here
	int result = 0;//wsService.sum(1, 9);
	System.out.println("Result from ws call = " + result);

    }

}