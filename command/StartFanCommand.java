package command;

public class StartFanCommand implements Command {
 
    Fan fan;
 
    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }
 
    @Override
    public void execute() {
        System.out.println("starting Fan.");
        fan.start();
    }

}
