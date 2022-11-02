import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import com.Employee;
import com.Management;
import com.Leader;
import com.Dev;

public class File {
  //read files path "D:\FPT\PRO192\Java\BT NHOM - Copy\Employee\src\data.csv" return list employeeList
	private static String path="D:\\FPT\\PRO192\\Java\\BT NHOM - Copy\\Employee\\src";
  public static ArrayList<Employee> inputCSV() throws FileNotFoundException, IOException, ParseException {
		BufferedReader br = null;
		String csvLine;

    br = new BufferedReader(new FileReader(path+"\\data.csv"));

		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		Date currentDate = new Date();

		while ((csvLine = br.readLine()) != null) {
			if (csvLine != null) {
				String[] splitData = csvLine.split(",");

				Employee employee = null;

				if (splitData[0].isEmpty() && splitData[2].isEmpty()) {
					System.out.println("Role và Account không được empty");
					//error+=1;
				}

        else if (splitData[1].length() < 6 && !"MNV".equals(splitData[1].substring(0, 2))) {
					System.out.println("Ma nhan vien khong dung format (phai bat dau MNV va co 6 ky tu");
					//error+=1;
				}

        else if (formatter.parse(splitData[3]).compareTo(currentDate) > 0) {
					System.out.println("Ngay vao cong ty phai nho hon ngay hien tai");
					//error+=1;
				}
				switch (splitData[0]) {
				case "1":
					employee = new Management(splitData[1], 1, splitData[2], formatter.parse(splitData[3]),
							Double.valueOf(splitData[4]), Integer.valueOf(splitData[5]), Integer.valueOf(splitData[6]));
					break;

				case "2":
					employee = new Leader(splitData[1], 2, splitData[2], formatter.parse(splitData[3]),
							Double.valueOf(splitData[4]), Integer.valueOf(splitData[5]), Integer.valueOf(splitData[6]));
					break;

				case "3":
					employee = new Dev(splitData[1], 3, splitData[2], formatter.parse(splitData[3]),
							Double.valueOf(splitData[4]), Integer.valueOf(splitData[5]));
					break;
				}

				employeeList.add(employee);
			}
		}

		br.close();
		return employeeList;
	}
	public static void outputCSV(ArrayList<Employee> employeeList) throws IOException {
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;

		try {
				fout = new FileOutputStream(path+"\\dataOut.csv");
				bout = new BufferedOutputStream(fout);
				for (Employee employee : employeeList) {
					String line = employee.toString();
					bout.write(line.getBytes());
				}
				bout.flush();
		} catch (IOException ex) {
				ex.printStackTrace();
		} finally {
				bout.close();
				fout.close();
		}

		System.out.println("success!");
}
}
