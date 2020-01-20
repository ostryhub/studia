package Lemma;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Lemmatyzator {

    public HashMap<String, String> inicjalizujMape() {

        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("ala", "alicja");
        mapa.put("poszła", "pójść");
        mapa.put("lasu", "las");
        mapa.put("nazbierała", "zbierać");
        mapa.put("grzybów", "grzyb");
        mapa.put("grzyby", "grzyb");

        return mapa;
    }

    public String lemmatyzuj (HashMap<String, String> mapa, String zdanie) {
        StringTokenizer st = new StringTokenizer(zdanie);

        String zlematyzowane = "";

        while(st.hasMoreTokens()) {

            String slowo = st.nextToken().toLowerCase().replaceAll("[-+.^:,]","");

            // dodawaj spacje jezeli mamy nastepny token, ale nie na poczatku zdania
            if (zlematyzowane.length() > 0) {
                zlematyzowane += " ";
            }

            if(mapa.get(slowo.toLowerCase()) == null) {
                zlematyzowane += slowo;
            } else {
                String lemma = mapa.get(slowo.toLowerCase());
                zlematyzowane += lemma;
            }
        }

        return zlematyzowane;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    HashMap<String, String> mapa;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Lemmatyzator)
        {
            Lemmatyzator other = (Lemmatyzator) obj;
            return mapa.equals(other.mapa);
        }
        else return false;
    }
}
