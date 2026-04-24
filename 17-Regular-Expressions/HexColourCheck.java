package RegularExpressions;

class HexColourCheck {
    public static void main(String[] args) {
        String colour = "#FFA500";

        if (colour.matches("^#[0-9A-Fa-f]{6}$"))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
