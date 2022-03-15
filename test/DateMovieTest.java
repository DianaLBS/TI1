import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


import model.Function;


class DateMovieTest {

	public void setupStage1()  {
		
		Function f1=new Function("12-10-2021","2:00","s","1:30",1);
		Function.functions.add(f1);
	}
	

	@Test
	void repitTest() {
		setupStage1();
		Function f2=new Function("12-10-2021","3:00","H","1:30",1);
		assertEquals(f2.search(f2), false);
	}
	@Test
	void goodTest() {
		setupStage1();
		Function f2=new Function("12-09-2021","9:00","H","1:30",1);
		assertEquals(f2.search(f2), true);
	}

}
