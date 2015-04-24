package Serveur;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.io.*;

public class ServeurAutoRegistry {

	public static void main(final String args[]) throws RemoteException {
		try{
			
			LocateRegistry.createRegistry(1099); 
			OD o = new OD();
			Naming.rebind("rmi://localhost:1099/od", o);
			System.out.println("C'est bon");
		}
		catch(Exception e ){
		System.out.println("ERREUR");
		e.printStackTrace();
		}
	}
}
