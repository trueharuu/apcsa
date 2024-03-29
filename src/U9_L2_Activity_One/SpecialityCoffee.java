public class SpecialityCoffee extends Coffee {

    // Additional member variable
    private String flavor;

    public SpecialityCoffee() {
        // Calls super-constructor to create default coffee then sets flavor
        super();
        flavor = "vanilla";
    }

    public SpecialityCoffee(String size, String type, String flavor) {
        // Calls constructor below with a mix of parameters and default values
        this(size, false, 1, type, flavor);
    }

    public SpecialityCoffee(String size, boolean isSkinny, int shots, String type, String flavor) {
        // Calls super-constructor to set first 4 variables then sets flavor
        super(size, isSkinny, shots, type);
        this.flavor = flavor;
    }

    public String toString() {
        // Calls Coffee toString and appends flavor to end
        return super.toString() + " with " + flavor;
    }

    public int getPrice() {
        final int bump = super.getPrice();

        if (this.getSize().equals("large") || this.getSize().equals("extra large")) {
            return bump + 50;
        }

        return bump + 30;
    }

}
