package homework_passengers;

public class Passenger {
    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    private String name;
    private String passport;

    public Passenger(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }
    public Passenger() {
        this.name = "Ivanov";
        this.passport = "KC215215";
    }
}
