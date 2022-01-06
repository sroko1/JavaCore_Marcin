package lightpackage.Q11;

import darkpakage.Q11.ACountryDebt;

public class LightWantsToAccess extends ACountryDebt {

    public LightWantsToAccess() {
    }

    public static void main(String[] args) {

        ACountryDebt digits = new ACountryDebt();

        System.out.println(digits.todayDebt);
        System.out.println(digits.yesterdayDebt);

    }
}
