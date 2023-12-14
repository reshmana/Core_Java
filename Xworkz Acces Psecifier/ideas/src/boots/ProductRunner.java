package boots;

import com.ideas.reshma.rules.DeliveryRule;
import com.ideas.reshma.rules.SellerDeliverRuleImpl;
import com.ideas.reshma.rules.SellerRule;

public class ProductRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in ProductRunner");

        SellerDeliverRuleImpl sellerDeliverRule=new SellerDeliverRuleImpl();
        sellerDeliverRule.damaged();
        sellerDeliverRule.deliveryCharges();
        sellerDeliverRule.replacement();
        sellerDeliverRule.packed();

        SellerRule rule=new SellerDeliverRuleImpl();
        rule.deliveryCharges();
        rule.replacement();

        DeliveryRule rule1=new SellerDeliverRuleImpl();
        rule1.damaged();
        rule1.packed();

        System.out.println("Ending main in ProductRunner");
    }
}

