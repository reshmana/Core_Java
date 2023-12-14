package boots;

import com.ideas.reshma.rules.Contractor;
import com.ideas.reshma.rules.MetroContractor;

import javax.swing.plaf.metal.MetalTreeUI;

public class ContractorsRunner {
    public static void main(String[] args) {
        System.out.println("starting main in ContractorsRunner ");

        Contractor contractor=new Contractor();
        contractor.Disposal();
        contractor.BuildingPlan();
        contractor.development();
        contractor.Employment();
        contractor.Rainwater();
        contractor.planning();
        contractor.Taxation();
        contractor.Wastewater();

        MetroContractor metroContractor=new MetroContractor();
        metroContractor.Disposal();
        metroContractor.ProperDisposal();
        metroContractor.planning();
        metroContractor.Segregation();
        metroContractor.ProperDisposal();
        metroContractor.development();
        metroContractor.Rainwater();
        metroContractor.BuildingPlan();
        metroContractor.Taxation();;
        metroContractor.Wastewater();

        System.out.println("starting main in ContractorsRunner ");
    }
}
