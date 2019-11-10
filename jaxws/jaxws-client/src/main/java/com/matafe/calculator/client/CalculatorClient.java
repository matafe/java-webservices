package com.matafe.calculator.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.matafe.calculator.Calculator;

/**
 * Calculator Client. (Consumer)
 * 
 * @author matafe@gmail.com
 */
public class CalculatorClient {

//    static {
//	// for localhost testing only
//	HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
//	    @Override
//	    public boolean verify(String hostname, SSLSession sslSession) {
//		if (hostname.equals("localhost")) {
//		    return true;
//		}
//		return false;
//	    }
//	});
//    }

    public void sum(int a, int b) throws Exception {

	// URL url = new URL("http://localhost:8080/jaxws-services/Calculator?wsdl");
	URL url = new URL("https://localhost:8443/jaxws-services/Calculator?wsdl");
	String namespaceURI = "http://calculator.matafe.com/";
	String name = "CalculatorService";
	QName qname = new QName(namespaceURI, name);
	Service service = Service.create(url, qname);

	Calculator wsService = service.getPort(Calculator.class);

	// remote call here
	int result = wsService.sum(1, 9);
	System.out.println("Result from ws call = " + result);
    }

    public static void main(String[] args) throws Exception {
	if (args.length < 2) {
	    throw new IllegalArgumentException("Number a and number b should be passed!");
	}
	new CalculatorClient().sum(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }

}