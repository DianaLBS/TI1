import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import exception.IncorrectIDException;

import model.PersonalData;

class LoginTest {

	// Setup stages
		public void setupStage1() throws IOException {
		String id="0000";
			PersonalData.getPersonal().add(id);
		}
		
		public void setupStage2() throws IOException {
			String id="0000";
				PersonalData.getPersonal().add(id);
			}
		@Test
		void correctId() throws IOException {
			
			setupStage1();
			assertDoesNotThrow(() -> {PersonalData.refreshIdData("0000");});
		}
		
		@Test
		void incorrectTest() throws IOException {
			setupStage1();
			assertThrows(IncorrectIDException.class, () -> {PersonalData.refreshIdData("1");});
		}

}
