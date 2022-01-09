import java.io.Serializable;

public class Employee implements Serializable{

		private String empName;
		private Integer empId;
		private transient Double empSalary;
		
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public Integer getEmpId() {
			return empId;
		}
		public void setEmpId(Integer empId) {
			this.empId = empId;
		}
		public Double getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(Double empSalary) {
			this.empSalary = empSalary;
		}	
	}