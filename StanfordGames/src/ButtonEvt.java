import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonEvt implements ActionListener {
	
	private String message;
	public ButtonEvt(String message) {
		this.message = message;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

}
