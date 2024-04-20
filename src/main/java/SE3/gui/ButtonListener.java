package SE3.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import SE3.api.Translate;

public class ButtonListener implements ActionListener {
    private final JComboBox<String> fromComboBox;
    private final JComboBox<String> toComboBox;
    private final JTextArea fromTextArea;
    private final JTextArea toTextArea;
    private final Translate translator;

    public ButtonListener(JComboBox<String> fromComboBox, JComboBox<String> toComboBox, JTextArea fromTextArea, JTextArea toTextArea, Translate translator) {
        this.fromComboBox = fromComboBox;
        this.toComboBox = toComboBox;
        this.fromTextArea = fromTextArea;
        this.toTextArea = toTextArea;
        this.translator = translator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Check if the event source is a JComboBox
        if (e.getSource() instanceof JComboBox) {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();

            // Check if the source combo box selection has changed
            if (comboBox == fromComboBox || comboBox == toComboBox) {
                translateText();
            }
        }
    }

    private void translateText() {
        String sourceLang = (String) fromComboBox.getSelectedItem();
        String targetLang = (String) toComboBox.getSelectedItem();
        String textToTranslate = fromTextArea.getText();

        // Perform translation only if source and target languages are selected and there is text to translate
        if (sourceLang != null && targetLang != null && !textToTranslate.isEmpty()) {
            try {
                String translatedText = translator.translateText(sourceLang, targetLang, textToTranslate);
                toTextArea.setText(translatedText);
            } catch (Exception ex) {
                // Handle translation error
                ex.printStackTrace();
                // Optionally, display an error message to the user
            }
        }
    }
}
