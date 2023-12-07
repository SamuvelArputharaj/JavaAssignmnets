package week3.day4;

public class RadioButton extends Button {
	
	public void selectRadioButton() {
		System.out.println("selectRadioButton");
	}

	public static void main(String[] args) {
		RadioButton s5 = new RadioButton();
		s5.selectRadioButton();
		s5.setString("Text 5");
		s5.click();
		s5.submit();
	
		
	}
}
