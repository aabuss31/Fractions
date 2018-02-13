
package fractions;

/**
 *
 * @author aaron.buss
 */
public class Fraction {
    private int n,d;
    
    public Fraction(int n, int d) {
        this.n = n;
        this.d = d;
    }
    
    public int getNumerator() {
        return n;
    }
    
    public void setNumerator(int n) {
        this.n = n;
    }
    
    public int getDenometer() {
        return d;
    }
    
    public void setDenometer(int d) {
        this.d = d;
    }
    
    
    public static Fraction add(Fraction a, Fraction b) {
        int den = a.d*b.d;
        int n1 = a.n*b.d;
        n2
    }
    
}//end class

