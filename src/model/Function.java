package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gson.Gson;

public class Function {

	public static ArrayList<Function>functions = new ArrayList<>();
	private String date;
    private String duration;
    private String filmName;
    private String hour;
    private int room;
	public Function(String date, String duration, String filmName, String hour, int room) {
		this.date = date;
		this.duration = duration;
		this.filmName = filmName;
		this.hour = hour;
		this.room = room;
	}
	
	public boolean search(Function function) {
		boolean flag=true;
		for(int i=0;i<functions.size();i++) {
			if(functions.get(i).getDate().equals(function.getDate())&&functions.get(i).getRoom()==function.getRoom()) {
		     ArrayList <Function> sameDate = new ArrayList<>();
		     sameDate.add(functions.get(i));
		     if(searchHour(sameDate,function)==false) {
		    	 flag=false;
		     }
			}
		}
		
		return flag;
	}
	public boolean searchHour(ArrayList<Function> sameDate,Function function) {
		boolean flag=true;
		
		for (int i = 0; i < sameDate.size(); i++) {
			String hour= sameDate.get(i).getHour();
			String[] hourS = hour.split(":");
		    int one = Integer.parseInt(hourS[0])*100;
		    int two = Integer.parseInt(hourS[1]);
		    int hourOne = one+two;
		    String duraone = sameDate.get(i).getDuration();
		    String[]done = duraone.split(":");
		    int oned = Integer.parseInt(done[0])*100;
		    int twod= Integer.parseInt(done[1]);
		    int durationOne = oned+twod;
		    String hourF= function.getHour();
			String[] hourSF = hourF.split(":");
			int oneF = Integer.parseInt(hourSF[0])*100;
		    int twoF = Integer.parseInt(hourSF[1]);
		    int hourtwo = oneF+twoF;
		    String duratwo = function.getDuration();
		    String[]dtwo = duratwo.split(":");
		    int oned2 = Integer.parseInt(dtwo[0])*100;
		    int twod2= Integer.parseInt(dtwo[1]);
		    int durationTwo = oned2+twod2;
		    if(hourOne+durationOne>hourtwo&&hourOne+durationOne<hourtwo+durationTwo) {
		    	flag=false;
		    }
		}
		return flag;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public static ArrayList<Function> getFunctions() {
		return functions;
	}

	public static void setFunctions(ArrayList<Function> functions) {
		Function.functions = functions;
	}

	@Override
	public String toString() {
		String Stringroom="";
		if(room==1) {
			Stringroom="MINIROOM";
			
		}else if(room==2) {
			Stringroom="HALF ROOM";
		}
		return filmName + " - " + date + " - " + Stringroom +"\n";
	}
	public static void saveJSON() {
		try {
			Gson gson = new Gson();
			String json = gson.toJson(functions);

			File file = new File("functions.json");
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(json.getBytes());
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void loadJSON() {
		try {
			FileInputStream fis = new FileInputStream(new File("functions.json"));
			BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

			String json = "";
			String line;
			while ((line = reader.readLine()) != null) {
				json += line;
			}
			Gson gson = new Gson();
			Function[] data = gson.fromJson(json, Function[].class);
			for (Function func : data) {
				functions.add(func);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    
}
