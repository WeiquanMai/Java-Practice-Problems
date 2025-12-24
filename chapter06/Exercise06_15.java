/**
 * @author Weiquan Mai
 * Problem 6.15
 * (Financial application: print a tax table)
 * Listing 3.5 gives a program to compute tax.
 * Write a method for computing tax using the following header:
 * public static double computeTax(int status, double taxableIncome)
 *
 * Use this method to write a program that prints a tax table for taxable income
 * from $50,000 to $70,000 with intervals of $100 for all the following statuses:
 *
 * Taxable      Single      Married Joint        Married         Head of
 * Income                   or Qualifying        Separate        a House
 *                          Widow(er)
 * ____________________________________________________________________
 * 50000        8688        6665                8688            7353
 * 50100        8713        6680                8713            7378
 * ...
 * 69900        13663       9850                12328           9840
 * 70000        13688       9875                12353           9853
 *
 * Hint: round the tax into integers using Math.round(i.e., Math.round(computeTax(status, taxableIncome)))
 */
public class Exercise06_15 {
    public static void main(String[] args){
        // Display header
        System.out.printf("%-11s%-10s%-17s%-11s%-7s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%-11s%-10s%-17s%-11s%-7s\n", "Income", "", "or Qualifying", "Separate", "a House");
        System.out.printf("%-11s%-10s%-17s%-11s%-7s\n", "", "", "Widow(er)", "", "");
        System.out.println("___________________________________________________________________");

        // Iterate from 50000 to 70000 in increments of 100
        for(int i = 50000; i <= 70000; i += 100){
            System.out.printf("%-11d%-10d%-17d%-11d%-7d\n", i, Math.round(computeTax(0, i)),
                    Math.round(computeTax(1, i)), Math.round(computeTax(2, i)), Math.round(computeTax(3, i)));

        }
    }

    public static double computeTax(int status, double taxableIncome){
        // Compute tax
        double tax = 0;

        // Tax brackets based on tax rates from 2009
        switch (status){
            // Compute tax for single filers
            case (0): {
                if (taxableIncome <= 8350){
                    tax = taxableIncome * 0.10;
                }
                else if (taxableIncome <= 33950){
                    tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
                }
                else if (taxableIncome <= 82250){
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                }
                else if (taxableIncome <= 171550){
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25
                            + (taxableIncome - 82250) * 0.28;
                }
                else if (taxableIncome <= 372950){
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25
                            + (171550 - 82250) * 0.28 + (taxableIncome - 171550) * 0.33;
                }
                else {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950)
                            * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
                }
                break;
            }
            // Compute tax for Married Filing Jointly or Qualifying Widower
            case (1): {
                if (taxableIncome <= 16700){
                    tax = taxableIncome * 0.10;
                }
                else if (taxableIncome <= 67900){
                    tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
                }
                else if (taxableIncome <= 137050){
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
                }
                else if (taxableIncome <= 208850){
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25
                            + (taxableIncome - 137050) * 0.28;
                }
                else if (taxableIncome <= 372950){
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25
                            + (208850 - 137050) * 0.28 + (taxableIncome - 208850) * 0.33;
                }
                else {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25
                            + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
                }
                break;
            }
            // Compute tax for Married Filing Separately
            case (2): {
                if (taxableIncome <= 8350){
                    tax = taxableIncome * 0.10;
                }
                else if (taxableIncome <= 33950){
                    tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
                }
                else if (taxableIncome <= 68525){
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                }
                else if (taxableIncome <= 104425){
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25
                            + (taxableIncome - 68525) * 0.28;
                }
                else if (taxableIncome <= 186475){
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25
                            + (104425- 68525) * 0.28 + (taxableIncome - 104425) * 0.33;
                }
                else {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25
                            + (104425- 68525) * 0.28 + (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
                }
                break;
            }
            // Compute tax for Head of Household
            case (3): {
                if (taxableIncome <= 11950){
                    tax = taxableIncome * 0.10;
                }
                else if (taxableIncome <= 45500){
                    tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
                }
                else if (taxableIncome <= 117450){
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
                }
                else if (taxableIncome <= 190200){
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25
                            + (taxableIncome - 117450) * 0.28;
                }
                else if (taxableIncome <= 372950){
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25
                            + (190200 - 117450) * 0.28 + (taxableIncome - 190200) * 0.33;
                }
                else {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25
                            + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
                }
                break;
            }
            default:
                System.out.println("Error: invalid status.");
                System.exit(1);
        }

        return tax;
    }
}
