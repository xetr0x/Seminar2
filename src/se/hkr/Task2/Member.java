package se.hkr.Task2;

public class Member{

    private String name;
    private Roles role;
    public enum Roles{

        Member, Administrator,
        Owner, Coach;

    }

    public Member(String name, Roles role){
        this.name = name;

        this.role = role;


    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRole(Roles role) {
        this.role = role;
    }
    public String getName() { return name; };
    public Roles getRole() { return  role; };


}

