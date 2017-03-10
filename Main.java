
public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();		// these are my objects.. 
		Worker worker = new Worker();
		Security security = new Security();
		Officer officer = new Officer();
		Chief chief = new Chief();
		Part_Time part_time = new Part_Time();
		Full_Time full_time = new Full_Time();
		Read read = new Read();
 
		read.readPersonnelText(args[0], manager, worker, security, officer, chief, part_time, full_time);    // reading input file 1(personnel.txt) //
		read.readMonitoringText(args[1], manager, worker, security, officer, chief, part_time, full_time);	 // reading input file 2(monitoring.txt)

		manager.computeWage();				// these are calculate methods for total wages ..
		officer.computeWage();				
		security.computeWage();				
		worker.computeWage();				
		chief.computeWage();
		part_time.computeWage();

		manager.writeTxt();					// these are write methods in registerNumber.txt's
		officer.writeTxt();
		security.writeTxt();
		worker.writeTxt();
		chief.writeTxt();
		part_time.writeTxt();

	}
}
