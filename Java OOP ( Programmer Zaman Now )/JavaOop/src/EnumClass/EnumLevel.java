public enum EnumLevel {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    EnumLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

