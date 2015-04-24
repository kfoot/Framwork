package Serveur;
import java.rmi.*;
import java.io.*;
import java.util.*;
import java.rmi.server.*;;
public class OD extends UnicastRemoteObject implements ODI{
	private Random alea;
	private int calls;
	
	public OD()throws RemoteException{
		System.out.println("ctor");
		alea = new Random();
		calls=0;
	}
	@Override
	public int getRandom() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("getRandom()"+this);
		calls++;
		return alea.nextInt();
	}

	@Override
	public int getCalls() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("getCalls()"+this);
		return calls;
	}

}
