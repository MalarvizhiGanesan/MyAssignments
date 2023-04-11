package week3.day1Assignment;

public class student {
	
	public int getStudentInfo(int id) {
			return id;
		}
	
	public void getStudentInfo() {
			int id=1535336;
			String StuName="Malar";
			System.out.println(id + StuName);
		}
	public String getStudentInfo(String email, String phoneNumber) {
		return email + phoneNumber;
				
		}
	public static void main(String[] args) {
		student st = new student();
		System.out.println(st.getStudentInfo(1550088));
		
			
		st.getStudentInfo();
		System.out.println(st.getStudentInfo("malar@gmail.com" , "93749320"));
	}

}