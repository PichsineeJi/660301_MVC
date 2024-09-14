import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class CowControl {
    private CowView view;
    private HashMap<String, Cow> cowInfo;
    private int totalMilk;

    public CowControl(CowView view, HashMap<String, Cow> cowInfo) {
        this.view = view;
        this.cowInfo = cowInfo;
        this.totalMilk = 0;

        // Register action listeners
        this.view.getSubmitButton().addActionListener(new SubmitButtonListener());
        this.view.getClearButton().addActionListener(new ClearButtonListener());
    }

    class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String id = view.getCowID();
            // Validation for cow ID input
            if (!id.matches("\\d{8}") || id.startsWith("0")) {
                view.showError("Cow ID must be 8 digits and cannot start with 0.");
                view.setCowID(""); // Clear input field
                return;
            }

            if (cowInfo.containsKey(id)) {
                Cow cow = cowInfo.get(id);
                String milkInfo = MilkCal.produceMilk(cow);
                String[] milkParts = milkInfo.split(": ");
                String milkType = milkParts[0];
                int milkQuantity = Integer.parseInt(milkParts[1].replace(" liters", ""));

                // Update table and total milk
                view.addRowToTable(new Object[]{
                        cow.getId(), cow.getColor(), cow.getYear(), cow.getMonth(), milkType, (milkQuantity + " L.")
                });
                totalMilk += milkQuantity;
                view.updateTotalMilkLabel(totalMilk);
            } else {
                view.showError("Cow ID not found.");
            }
            view.setCowID(""); // Clear input field
        }
    }

    class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.clearTable(); // Clear table
            totalMilk = 0; // Reset total milk
            view.updateTotalMilkLabel(totalMilk);
        }
    }
}
