package command;

public class StopFanCommand implements Command {

    Fan fan;

    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.println("Stopping Fan.");
        fan.stop();
    }
    
}
