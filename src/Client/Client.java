package Client;
import java.rmi.*;
import java.io.*;

import Serveur.ODI;

public class Client{
	public static void main(String []args){
		try{
			ODI o = (ODI)Naming.lookup("//localhost/od");
			System.out.println("OD="+o);
			for(int i =0;i<10;i++){
				System.out.println("Rand("+i+")="+o.getRandom());
				
			}
			System.out.println("Calls :"+o.getCalls());
			System.out.println("karim");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
	
	
