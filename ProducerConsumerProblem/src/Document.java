class Document {
    private static int counter = 0;
    private int id;

    public Document() {
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Document " + id;
    }
}
