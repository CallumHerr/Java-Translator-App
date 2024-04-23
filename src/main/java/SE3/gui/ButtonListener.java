package SE3.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import SE3.api.Translate;

public class ButtonListener implements ActionListener {
    private final JComboBox<String> fromComboBox;
    private final JComboBox<String> toComboBox;
    private final JTextArea fromTextArea;
    private final JTextArea toTextArea;
    private final Translate translator;
    private final HashMap<String, String> langs = new HashMap<String, String>() {{
    	put("English", "EN");
    	put("French", "FR");
    	put("Spanish", "ES");
    	put("Italian", "IT");
    }};

    public ButtonListener(JComboBox<String> fromComboBox, JComboBox<String> toComboBox, JTextArea fromTextArea, JTextArea toTextArea) throws Exception {
        this.fromComboBox = fromComboBox;
        this.toComboBox = toComboBox;
        this.fromTextArea = fromTextArea;
        this.toTextArea = toTextArea;
        this.translator = new Translate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	String sourceLang = langs.get(fromComboBox.getSelectedItem().toString());
    	String newLang = langs.get(toComboBox.getSelectedItem().toString());
    	if (sourceLang == null || newLang == null) return;
    	
    	String textToTranslate = fromTextArea.getText();
    	System.out.println(textToTranslate);
    	if (textToTranslate.isEmpty()) return;
    	
    	try {
			String translatedText = translator.translateText(sourceLang,
					newLang, textToTranslate);
			System.out.println(translatedText);
			toTextArea.setText(translatedText);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
    }
}
