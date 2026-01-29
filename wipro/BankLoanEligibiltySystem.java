import java.util.*;

public class BankLoanEligibiltySystem {
    public static void main(String[] args) {
        Integer age =21;
        Integer cibil =700;
        ArrayList<Double> income = new ArrayList<>();
        income.add(25000.0);
        income.add(35000.0);
        income.add(45000.0);
        income.add(55000.0);
        double totalIncome =0;
        for(Double Mon_income : income){
            totalIncome+=Mon_income;
        }

    }
}
