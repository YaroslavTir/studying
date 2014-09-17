package luxsofttest.question3.a;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class ComplexNumberHolder {
    private final ComplexNumber number = new ComplexNumber();

    public synchronized ComplexNumber  getNumber() {
        return number;
    }

    public synchronized void setNumber(ComplexNumber newNumber) {
        number.real = newNumber.real;
        number.imaginary = newNumber.imaginary;
    }
}
