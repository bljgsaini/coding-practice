package designPattern.behavioral.statePattern.example2;

public class HighState implements State {
    @Override
    public void turnUp(Fan fan) {

    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is at medium");
    }
}
