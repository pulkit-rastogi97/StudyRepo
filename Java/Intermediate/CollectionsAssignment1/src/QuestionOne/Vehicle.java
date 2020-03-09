package QuestionOne;

public class Vehicle {
	private int vehNo;
	private Vehicle_Type type;
	public Vehicle(int vehNo, Vehicle_Type type) {
		this.vehNo = vehNo;
		this.type = type;
	}
	/**
	 * @return the vehNo
	 */
	public int getVehNo() {
		return vehNo;
	}
	/**
	 * @param vehNo the vehNo to set
	 */
	public void setVehNo(int vehNo) {
		this.vehNo = vehNo;
	}
	/**
	 * @return the type
	 */
	public Vehicle_Type getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Vehicle_Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Vehicle [vehNo=" + vehNo + ", type=" + type + "]";
	}
	
	

}
