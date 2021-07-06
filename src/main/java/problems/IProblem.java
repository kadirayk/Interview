package problems;

public interface IProblem<T> {

    /**
     * solves the given problem and sets result internally
     */
    void solve();

    /**
     * returns the internally set solution by solve() method
     * @return
     */
    T getResult();

}
