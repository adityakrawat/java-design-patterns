package strategy;

public class StrategyMain {
    
    public static void main(String... args) {
        TelecomOperator operator = new TelecomOperator();
        operator.activatePlan(new BasicPlan());
        System.out.println("PlanDetails: " + operator.getPlanName() + ", Free SMS: "+ operator.getFreeSMS() + ", Free TalkTime: "+ operator.getFreeTalkTime());

        operator.activatePlan(new SuperPlan());
        System.out.println("PlanDetails: " + operator.getPlanName() + ", Free SMS: "+ operator.getFreeSMS() + ", Free TalkTime: "+ operator.getFreeTalkTime());
        
    }
}
