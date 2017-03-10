import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Read {

	public void readPersonnelText(String path, Manager manager, Worker worker, Security security, Officer officer,
			Chief chief, Part_Time part_time, Full_Time full_time) {
		try {
			int count = 0;
			int length = Files.readAllLines(Paths.get(path)).size();
			String[] results = new String[length];
			for (String line : Files.readAllLines(Paths.get(path))) {
				results[count++] = line;
			}
			for (int i = 0; i < length; i++) {
				String[] word = results[i].split("	");
				if (("MANAGER").equals(word[2])) {     	  // if he/she is manager then equal his/her info to variables..
					String[] word2 = word[0].split(" ");
					manager.setName(word2[0]);
					manager.setSurname(word2[1]);
					manager.setRegisterNumber(word[1]);
					manager.setPosition(word[2]);
					manager.setYear_of_start(Integer.parseInt(word[3]));
				} else if (("WORKER").equals(word[2])) {		// if he/she is worker then equal his/her info to variables..
					String[] word2 = word[0].split(" ");
					worker.setName(word2[0]);
					worker.setSurname(word2[1]);
					worker.setRegisterNumber(word[1]);
					worker.setPosition(word[2]);
					worker.setYear_of_start(Integer.parseInt(word[3]));
				} else if (("SECURITY").equals(word[2])) {		// if he/she is security then equal his/her info to variables..
					String[] word2 = word[0].split(" ");
					security.setName(word2[0]);
					security.setSurname(word2[1]);
					security.setRegisterNumber(word[1]);
					security.setPosition(word[2]);
					security.setYear_of_start(Integer.parseInt(word[3]));
				} else if (("OFFICER").equals(word[2])) {			// if he/she is officer then equal his/her info to variables..
					String[] word2 = word[0].split(" ");
					officer.setName(word2[0]);
					officer.setSurname(word2[1]);
					officer.setRegisterNumber(word[1]);
					officer.setPosition(word[2]);
					officer.setYear_of_start(Integer.parseInt(word[3]));
				} else if (("CHIEF").equals(word[2])) {				// if he/she is chief then equal his/her info to variables..
					String[] word2 = word[0].split(" ");
					chief.setName(word2[0]);
					chief.setSurname(word2[1]);
					chief.setRegisterNumber(word[1]);
					chief.setPosition(word[2]);
					chief.setYear_of_start(Integer.parseInt(word[3]));
				} else if (("PARTTIME_EMPLOYEE").equals(word[2])) {			// if he/she is part-time employee then equal his/her info to variables..
					String[] word2 = word[0].split(" ");
					part_time.setName(word2[0]);
					part_time.setSurname(word2[1]);
					part_time.setRegisterNumber(word[1]);
					part_time.setPosition(word[2]);
					part_time.setYear_of_start(Integer.parseInt(word[3]));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readMonitoringText(String path, Manager manager, Worker worker, Security security, Officer officer,
			Chief chief, Part_Time part_time, Full_Time full_time) {
		try {
			int count = 0;
			int length = Files.readAllLines(Paths.get(path)).size();
			String[] results = new String[length];
			for (String line : Files.readAllLines(Paths.get(path))) {
				results[count++] = line;
			}
			for (int i = 0; i < length; i++) {
				String[] word = results[i].split("	");
				if (word[0].indexOf("M") >= 0) {		// if he/she is manager then assign his/her workhours to workhours[]..
					for (int j = 0; j < 4; j++) {
						manager.setWork_hour(Integer.parseInt(word[j + 1]), j);
					}
				} else if (word[0].indexOf("W") >= 0) {		// if he/she is worker then assign his/her workhours to workhours[]..
					for (int j = 0; j < 4; j++) {
						worker.setWork_hour(Integer.parseInt(word[j + 1]), j);
					}
				} else if (word[0].indexOf("S") >= 0) {		// if he/she is secuirty then assign his/her workhours to workhours[]..
					for (int j = 0; j < 4; j++) {
						security.setWork_hour(Integer.parseInt(word[j + 1]), j);
					}
				} else if (word[0].indexOf("O") >= 0) {		// if he/she is officer then assign his/her workhours to workhours[]..
					for (int j = 0; j < 4; j++) {
						officer.setWork_hour(Integer.parseInt(word[j + 1]), j);
					}
				} else if (word[0].indexOf("C") >= 0) {		// if he/she is chief then assign his/her workhours to workhours[]..
					for (int j = 0; j < 4; j++) {
						chief.setWork_hour(Integer.parseInt(word[j + 1]), j);
					}
				} else if (word[0].indexOf("P") >= 0) {		// if he/she is part-time employee then assign his/her workhours to workhours[]..
					for (int j = 0; j < 4; j++) {
						part_time.setWork_hour(Integer.parseInt(word[j + 1]), j);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
