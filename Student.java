
class Student{
	private String prn;
    private String name;
    private String dob;
    private double marks;
	
	public Student(String prn, String name, String dob, double marks) {
      this.prn = prn;
      this.name = name;
	  this.dob = dob;
      this.marks = marks;
 }
	
	//setter and getter for prn
	public String getPRN() {
       return prn;
 }
    public String getName() {
       return name;
 }
    public String getDOB() {
       return dob;
 }
    public double getMarks() {
       return marks;
 }
    public void setMarks(double marks) {
       this.marks = marks;
 }
 @Override
    public String toString() {
       return "PRN: " + prn + ", Name: " + name + ", DoB:" + dob + ", Marks: " + marks;
 }
} 

