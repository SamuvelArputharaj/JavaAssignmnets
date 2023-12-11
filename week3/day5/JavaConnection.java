package week3.day5;

public class JavaConnection implements DatabaseConnection{


	@Override
	public void connect() {
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}
	
	
	public static void main(String[] args) {
		
		JavaConnection jC =new JavaConnection();
		jC.connect();
		jC.disconnect();
		jC.executeUpdate();
	}
}
