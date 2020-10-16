package JavaAssignments.Assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class KYC {
    final static String format = "dd-LL-yyyy";
    public void findRange(String signUpDates, String currDates){
    String newDate = signUpDates.substring(0,6)+ currDates.substring(6);

    LocalDate anniversaryDate = LocalDate.parse(newDate, DateTimeFormatter.ofPattern(format));
    LocalDate currentDate = LocalDate.parse(currDates, DateTimeFormatter.ofPattern(format));

    String pastDate = anniversaryDate.minusDays(30).format(DateTimeFormatter.ofPattern(format));
    String futureDate = anniversaryDate.plusDays(30).format(DateTimeFormatter.ofPattern(format));

    String signUpYear = signUpDates.substring(6,10);
    String currYear = currDates.substring(6,10);

        if(signUpYear.equals(currYear))
            System.out.println("No range");

        else {
            System.out.print("\n"+pastDate);
            int result = anniversaryDate.plusDays(30).compareTo(currentDate);
            if (result <= 0) {
                System.out.print("  " + futureDate);
            }
            else {
                System.out.print("  " + currDates);
            }
    }
}
}

