package br.ufpb.dcx.dsc.hellodsc.enums;

public enum LevelOfSpringBootFamiliarity {
    ZERO, HEARD_ABOUT, FAMILIAR, ADVANCED;

    private String description;

    LevelOfSpringBootFamiliarity() {
        setDescription();
    }

    private void setDescription() {
        switch (this.ordinal()) {
            case 0:
                description = "I never used and know nothing about it.";
                break;
            case 1:
                description = "I know that is used to build APIs, but I never used it.";
                break;
            case 2:
                description = "I used to build simple APIs, but I am not expert on building bigger APIs and with the design patters and other design aspects we should use.";
                break;
            default:
                description = "I am very familiar with spring boot development, including all the concepts we must understand to build robust APIs (eg. MVC, DTO, DAO, security aspects - JWT, JPA relationships, and so on).";
        }
    }

    public String getDescription() {
        return description;
    }

    //0-NEVER - I never used and know nothing about it

    //1-HEARD_ABOUT - I know that is used to build APIs, but I never used it

    //2-FAMILIAR - I used to build simple APIs, but I am not expert on
    // building bigger APIs and with the design patters and other design aspects
    // we should use

    //3-ADVANCED - I am very familiar with spring boot development, including all the
    // concepts we must understand to build robust APIs (eg. MVC, DTO, DAO, security
    // aspects - JWT, JPA relationships, and so on)
}
