package br.ufpb.dcx.dsc.hellodsc.enums;

public enum LevelOfJavaProgrammingSkills {
    STARTER,
    BASIC,
    AVERAGE,
    ADVANCED;

    private String description;

    LevelOfJavaProgrammingSkills() {
        setDescription();
    }

    private void setDescription() {
        switch (this.ordinal()) {
        case 0:
            description = "Someone who was approved in LP and POO but with serious difficulties, does not feel confident even to program a simple app.";
            break;
        case 1:
            description = "Someone who knows basic notions of programming with Java and OO but does not feel confident to design/code bigger systems.";
            break;
        case 2:
            description = "Someone who feels confident to program in Java and is able to design OO systems following basic rules of responsibility assignment such as information expert, low coupling and high cohesion.";
            break;
        default:
            description = "Someone who feels confident not only on how to program in Java but also to follow basic responsibility assignment patterns as well as many other OO project patterns.";
        }
    }

    public String getDescription() {
        return description;
    }

    //0-STARTER - Someone who was approved in LP and POO but with serious difficulties,
    // does not feel confident even to program a simple app

    //1-BASIC - Someone who knows basic notions of programming with Java and OO but does not feel
    // confident to design/code bigger systems

    //2-AVERAGE - Someone who feels confident to program in Java and is able to design OO systems
    // following basic rules of responsibility assignment such as information expert,
    // low coupling and high cohesion

    //3-ADVANCED - Someone who feels confident not only on how to program in Java but also to follow
    // basic responsibility assignment patterns as well as many other OO project patterns
}
