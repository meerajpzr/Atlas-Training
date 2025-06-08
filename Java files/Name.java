class Name {
    public String fullName;  // Field to store full name

    // Constructor to initialize fullName
    public Name(String fullName) {
        this.fullName = fullName;
    }

    // Override toString() to return the name nicely
    @Override
    public String toString() {
        return fullName;
    }
}
