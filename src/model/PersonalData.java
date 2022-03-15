package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import exception.IncorrectIDException;

public class PersonalData {

private static ArrayList<String>personal=new ArrayList<>();

    
	public static void addPersonalID() {
		getPersonal().add("123456");
		getPersonal().add("1234");
		getPersonal().add("1000");
		getPersonal().add("0000");
	}
	public static ArrayList<String>getData(){
		return getPersonal();
	}
	public static boolean searchID(String id) {
		boolean flag=false;
		for(int i=0;i<getPersonal().size()&&!flag;i++) {
			if(getPersonal().get(i).equals(id)) {
				flag=true;
			}
		}
		return flag;
	}
	public static void refreshIdData(String id) throws IOException, IncorrectIDException {
		File file=new File("idData.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fos= new FileOutputStream(file);
		FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        String line = null;
		
        String message=toStringID();
		
		fos.write(message.getBytes());
		fos.close();
		
		
		boolean found = false;
		while ((line = br.readLine()) != null && found==false) {
            if (line.equals(id)) {
                found = true;
            }
        }
		fis.close();
		if (found==false) {
            throw new IncorrectIDException();
        }
		
	}
	
	public static String toStringID() {
		String message="";
		
		for(int i=0; i<getPersonal().size();i++) {
			message+=getPersonal().get(i)+"\n";
		}
	return message;
	}
	public static ArrayList<String> getPersonal() {
		return personal;
	}
	public static void setPersonal(ArrayList<String> personal) {
		PersonalData.personal = personal;
	}
}
