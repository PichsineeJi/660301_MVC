import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CowView {
    private JFrame frame;
    private JTextField textField;
    private DefaultTableModel tableInput;
    private JLabel totalMilkLabel;
    private JButton submitButton;
    private JButton clearButton;

    public CowView() {
        // Frame setup
        frame = new JFrame("Happy Farm Happy Cow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout(10, 10));

        // Input part
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Enter Cow ID:");
        textField = new JTextField(10); // Input box size
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear Table");

        // Table to show data
        String[] columnNames = {"Cow ID", "Color", "Age (Years)", "Age (Months)", "Milk Type", "Milk Quantity"};
        tableInput = new DefaultTableModel(columnNames, 0);
        JTable cowTable = new JTable(tableInput);
        JScrollPane tableScrollPane = new JScrollPane(cowTable);

        // For total milk display
        totalMilkLabel = new JLabel("Total Milk Quantity: 0 L");
        JPanel statusPanel = new JPanel();
        statusPanel.add(totalMilkLabel);

        // Add components to the input panel
        inputPanel.add(label);
        inputPanel.add(textField);
        inputPanel.add(submitButton);
        inputPanel.add(clearButton);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(tableScrollPane, BorderLayout.CENTER);
        frame.add(statusPanel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }

    public String getCowID() {
        return textField.getText().trim();
    }

    public void setCowID(String id) {
        textField.setText(id);
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public void addRowToTable(Object[] rowData) {
        tableInput.addRow(rowData);
    }

    public void clearTable() {
        tableInput.setRowCount(0);
    }

    public void updateTotalMilkLabel(int totalMilk) {
        totalMilkLabel.setText("Total Milk Quantity: " + totalMilk + " L.");
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }
}

