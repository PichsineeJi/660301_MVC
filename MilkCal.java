public class MilkCal {
    public static String produceMilk(Cow cow) {
        int milkQuantity;
        String milkType;

        switch (cow.getColor().toLowerCase()) {
            case "white" -> {
                milkType = "Plain Milk";
                milkQuantity = 120 - ((cow.getYear()* 12) + cow.getMonth());
            }
            case "brown" -> {
                milkType = "Chocolate Milk";
                milkQuantity = 40 - cow.getYear();
            }
            case "pink" -> {
                milkType = "Strawberry Milk";
                milkQuantity = 30 - cow.getMonth();
            }
            default -> {
                milkType = " ";
                milkQuantity = 0;
            }
        }

        return String.format("%s: %d liters", milkType, milkQuantity);
    }
}
