public class Pair<Type1, Type2> {

    private final Type1 first;
    private final Type2 second;

    public Pair(Type1 first, Type2 second) {
        this.first = first;
        this.second = second;
    }

    public Type1 getFirst() {
        return first;
    }

    public Type2 getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        return first.hashCode() ^ second.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair))
            return false;
        Pair pair = (Pair) o;
        return this.first.equals(pair.getFirst()) && this.second.equals(pair.getSecond());
    }

}