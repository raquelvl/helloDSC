package br.ufpb.dcx.dsc.hellodsc.enums;

public enum LevelOfMotivation {
    VERY_LOW,
    LOW,
    MEDIUM,
    HIGH;

    private String description;

    LevelOfMotivation() {
        setDescription();
    }

    private void setDescription() {
        switch (this.ordinal()) {
            case 0:
                description = "I hate programming, I have Java and I am here just because I have to graduate.";
                break;
            case 1:
                description = "I don't like Java, so I am low motivated to program in Java in this semester.";
                break;
            case 2:
                description = "I am curious about what we are going to learn here, but not very excited.";
                break;
            default:
                description = "I am very excited to learn more and practice REST APIs design and implementation using Java and Spring Boot.";
        }
    }

    public String getDescription() {
        return description;
    }

    //0-VERY_LOW - I hate programming, I hate Java and I am here just because I have to graduate

    //1-LOW - I don't like Java, so I am low motivated to program in Java in this semester

    //2-MEDIUM - I am curious about what we are going to learn here, but not very excited

    //3-HIGH - I am very excited to learn more and practice REST APIs design and implementation
    // using Java and Spring Boot

}
