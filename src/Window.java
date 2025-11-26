import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {
    public static void window() {
        JFrame frame = new JFrame("Linux Tooltip In Java With GUI");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        int frameWidth  = frame.getWidth();
        // int frameHeight = frame.getHeight(); // IDK ChatGPT Put this here but I commented it out and it works fine lol!

        // ----- LABEL -----
        JLabel label = new JLabel("Click the button for a tip!", JLabel.CENTER);
        int labelWidth  = 400;
        int labelHeight = 30;
        label.setBounds(
            (frameWidth - labelWidth) / 2,   // center X
            60,                              // Y
            labelWidth,
            labelHeight
        );
        frame.add(label);
        // -------------------

        // ----- BUTTON -----
        JButton button = new JButton("Click For A Linux Tool Tip!");
        int btnWidth  = 300;
        int btnHeight = 60;
        button.setBounds(
            (frameWidth - btnWidth) / 2,     // center X
            150,                             // Y
            btnWidth,
            btnHeight
        );
        frame.add(button);
        // -------------------

        // When button is clicked: update label
        button.addActionListener(e -> {
            String output = Call.HTTPCall();
            label.setText(output);
        });

        frame.setVisible(true);
    }
}