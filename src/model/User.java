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

public class User {

	private static ArrayList<User>users = new ArrayList<>();
	private String name;
	private String id;
	private String function;
	
	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public static ArrayList<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users) {
		User.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User(String name, String id,String function) {
		this.name = name;
		this.id = id;
		this.function = function;
	}
	
	public static void saveJSON() {
		try {
			Gson gson = new Gson();
			String json = gson.toJson(users);

			File file = new File("users.json");
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
			FileInputStream fis = new FileInputStream(new File("users.json"));
			BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

			String json = "";
			String line;
			while ((line = reader.readLine()) != null) {
				json += line;
			}
			Gson gson = new Gson();
			User[] data = gson.fromJson(json, User[].class);
			for (User u : data) {
				users.add(u);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
