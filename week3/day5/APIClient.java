package week3.day5;

public class APIClient {

	public void sendRequest(String endpoint) {
		
		System.out.println("Print the endpoint: "+endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,String requestStatus) {
		
		System.out.println("Print the endpoint: "+endpoint);
		System.out.println("Print the requestBody: "+requestBody);
		System.out.println("Print the requestStatus: "+requestStatus);
	}
	
	public static void main(String[] args) {
		APIClient api=new APIClient();
		api.sendRequest("https://www.edge.com");
		api.sendRequest("https://www.google.com", "{Login='test'}", "200");
		
	}
	
}
