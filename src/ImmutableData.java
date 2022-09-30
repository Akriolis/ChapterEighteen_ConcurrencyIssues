public final class ImmutableData {
    private final String name;
    private final int value;

    public ImmutableData(String name, int value){
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
