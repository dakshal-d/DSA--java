
import java.util.Scanner;

class Polynomial {
    static class PolyTerm {
        int coeff;
        int exp;
        PolyTerm next;

        public PolyTerm(int coeff, int exp) {
            this.coeff = coeff;
            this.exp = exp;
            this.next = null;
        }
    }

    static PolyTerm createTerm(int coeff, int exp) {
        return new PolyTerm(coeff, exp);
    }

    static void addTerm(PolyTerm[] poly, int coeff, int exp) {
        PolyTerm term = createTerm(coeff, exp);
        if (poly[0] == null) {
            poly[0] = term;
            return;
        }
        PolyTerm last = poly[0];
        while (last.next != null) {
            last = last.next;
        }
        last.next = term;
    }

    static int evaluatePoly(PolyTerm poly, int x) {
        int result = 0;
        while (poly != null) {
            result += poly.coeff * Math.pow(x, poly.exp);
            poly = poly.next;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degree, coeff, x;
        PolyTerm[] poly = new PolyTerm[1];
        degree = scanner.nextInt();

        for (int i = degree; i >= 0; i--) {
            coeff = scanner.nextInt();
            if (coeff != 0) {
                addTerm(poly, coeff, i);
            }
        }
        x = scanner.nextInt();
        int result = evaluatePoly(poly[0], x);
        System.out.println(result);
        scanner.close();
    }
}