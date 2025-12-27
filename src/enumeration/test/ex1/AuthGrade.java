package enumeration.test.ex1;

public enum AuthGrade {
    GUEST(1, "guest"),
    LOGIN(2, "member"),
    ADMIN(3, "admin");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public String[] getMenus(){
        switch (this){
            case GUEST: return new String[]{"home"};
            case LOGIN: return new String[]{"home", "email admin"};
            case ADMIN: return new String[]{"home", "email admin", "admin"};
            default: return new String[0];
        }
    }
}
