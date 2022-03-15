package model;

import java.util.ArrayList;

public class MovieTheater {

	private static ArrayList<MovieTheater> rooms = new ArrayList<>();
	private int[]matrixRoom = new int[8];
	private Function function;
	
	
	public static ArrayList<MovieTheater> getRooms() {
		return rooms;
	}


	public static void setRooms(ArrayList<MovieTheater> rooms) {
		MovieTheater.rooms = rooms;
	}


	public int[] getMatrixRoom() {
		return matrixRoom;
	}


	public void setMatrixRoom(int[] matrixRoom) {
		this.matrixRoom = matrixRoom;
	}


	public Function getFunction() {
		return function;
	}


	public void setFunction(Function function) {
		this.function = function;
	}


	public MovieTheater(int[]matrixRoom, Function function) {
		this.matrixRoom = matrixRoom;
		this.function = function;
	}
	
	
}