import java.util.Calendar;

public class Data {

    private Calendar data;

    public Data(int dia, int mes, int ano) {
        data = Calendar.getInstance();
        data.set(ano, mes - 1, dia);
    }

    public int getDia() {
        return data.get(Calendar.DAY_OF_MONTH);
    }

    public int getMes() {
        return data.get(Calendar.MONTH) + 1;
    }

    public int getAno() {
        return data.get(Calendar.YEAR);
    }
}