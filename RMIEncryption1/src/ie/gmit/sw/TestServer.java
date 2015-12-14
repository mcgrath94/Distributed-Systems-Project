package ie.gmit.sw;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class TestServer {
	
	public static void main(String[] args) throws Exception {
		
		VigenereBreaker vb = new VigenereBreakerImpl();
		LocateRegistry.createRegistry(1099);
		
		Naming.bind("cypher-service", new VigenereBreakerImpl());
		System.out.println("service started...");
	}

}
