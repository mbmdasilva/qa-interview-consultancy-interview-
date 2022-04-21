package taxcalc;

class TaxCalc {
    int percent;

    TaxCalc(int percent) {
        this.percent = percent;
    }

    @SafeVarargs
    final Pair<Integer, String> netAmount(Pair<Integer, String> first, Pair<Integer, String>... rest) {
        Pair<Integer, String> total = first;

        //Compare first and second currency symbol values
        for (Pair<Integer, String> next : rest) {
            if (!next.second.equals(total.second)) {
                throw new ApplicationException();
            }
        }
        //Add first amount to the next amount from the list
        //Append the currency symbol to the amount
        total = addAppendAmount(total, rest);

        //Calculate the tax
        return calculateTax(first, total);
    }

    private Pair<Integer, String> calculateTax(Pair<Integer, String> first, Pair<Integer, String> total) {
        double amount = total.first * (percent / 100d);
        Pair<Integer, String> tax = new Pair<>((int) amount, first.second);
        if (total.second.equals(tax.second)) {
            return new Pair<>(total.first - tax.first, first.second);
        } else {
            throw new ApplicationException();
        }
    }

    protected Pair<Integer, String> addAppendAmount(Pair<Integer, String> total, Pair<Integer, String>... rest) {
        for (Pair<Integer, String> next : rest) {
            total = new Pair<>(total.first + next.first, next.second);
        }
        return total;
    }

    static class Pair<A, B> {
        final A first;
        final B second;

        Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

    }
}