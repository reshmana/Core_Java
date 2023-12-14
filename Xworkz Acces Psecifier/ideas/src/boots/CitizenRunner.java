package boots;

import com.ideas.reshma.rules.CitizenRule;
import com.ideas.reshma.rules.CitizenRuleImpl;

public class CitizenRunner {
    public static void main(String[] args) {
        System.out.println("starting main method");

        CitizenRuleImpl citizenRule = new CitizenRuleImpl();

        CitizenRule citizenRule1=(CitizenRule) citizenRule;//typecasting
         citizenRule1.nri();
         citizenRule1.voterId();
         citizenRule1.markcard();
         citizenRule1.signalJump();
         citizenRule1.voterId();

         Object object=(CitizenRule) citizenRule;

        System.out.println("ending main method");



    }
}