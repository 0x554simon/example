import java.awt.*;
import java.awt.event.*;

public class QuestionDialog extends WorkDialog 
                            implements ActionListener{
	static private int  _defaultTextFieldSize = 20;
	private Button      okButton;
	private Button      cancelButton;
	private String      question;
	private TextField   textField;
	private boolean     wasCancelled;
	private ButtonPanel buttonPanel = new ButtonPanel();

	public QuestionDialog(Frame  frame, DialogClient client,
							String title, String question,
							String initialResponse, Image image) {
		this(frame, client, title, question, initialResponse, 
			_defaultTextFieldSize, image);
	}
	public QuestionDialog(Frame  frame, DialogClient client,
							String title, String question,
							Image image) {
		this(frame, client, title,
				question, null, _defaultTextFieldSize, image);
	}
	public QuestionDialog(Frame  frame, DialogClient client,
							String title, String question, 
							int textFieldSize, Image image) {
		this(frame, client, title, 
			question, null, textFieldSize, image);
	}
	public QuestionDialog(Frame  frame, DialogClient client, 
							String title, String question,
							String initialResponse, 
							int textFieldSize, Image image) {
		this(frame, client, title, question, initialResponse,
			textFieldSize, image, false);
	}
	public QuestionDialog(Frame  frame, DialogClient client, 
							String title, String question, 
							String initialResponse, 
							int textFieldSize, Image image, 
							boolean modal) {
		super(frame, client, title, modal);

		QuestionPanel questionPanel;

		okButton     = addButton("Ok");
		cancelButton = addButton("Cancel");

		okButton.addActionListener(this);
		cancelButton.addActionListener(this);

		questionPanel = new QuestionPanel(this, question, 
											initialResponse, 
											textFieldSize,
											image);
		textField = questionPanel.getTextField();
		setWorkPanel(questionPanel);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == cancelButton) 
			wasCancelled = true;
		else                             
			wasCancelled = false;

		dispose();
	}
	public void setVisible(boolean b) {
		textField.requestFocus();
		super.setVisible(b);
	}
	public void returnInTextField() {
		okButton.requestFocus();
	}
	public TextField getTextField() {
		return textField;
	}
	public String getAnswer() {
		return textField.getText();
	}
	public boolean wasCancelled() {
		return wasCancelled;
	}
	private void setQuestion(String question) {
		this.question = question;
	}
}
class QuestionPanel extends Postcard {
	private TextField      field;
	private QuestionDialog dialog;

	public QuestionPanel(QuestionDialog dialog, 
							String question, Image image) {
		this(dialog, question, null, 0, image);
	}
	public QuestionPanel(QuestionDialog dialog, String question,
							int columns, Image image) {
		this(dialog, question, null, columns, image);
	}
	public QuestionPanel(QuestionDialog myDialog, 
							String question,
							String initialResponse, int cols, 
							Image image) {
		super(image, new Panel());

		Panel panel = getPanel();
		this.dialog = myDialog;

		panel.setLayout(new RowLayout());
		panel.add(new Label(question));

		if(initialResponse != null) {
			if(cols != 0) 
				panel.add(field = 
							new TextField(initialResponse, cols));
			else          
				panel.add(field = 
							new TextField(initialResponse));
		}
		else {
			if(cols != 0) panel.add(field = new TextField(cols));
			else          panel.add(field = new TextField());
		}

		field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dialog.returnInTextField();
			}
		});
	}
	public TextField getTextField() {
		return field;
	}
}
