package Lemma;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Lemmatyzator lemmatyzator = new Lemmatyzator();
        HashMap<String, String> mapa = lemmatyzator.inicjalizujMape();

        String zdanie = "Ala poszła do lasu i nazbierała grzyby.";

        String zdanieZlematyzowane = lemmatyzator.lemmatyzuj(mapa, zdanie);

        System.out.println("Oruginalne: '"+zdanie+"'");
        System.out.println("Zlematyzowane: '"+zdanieZlematyzowane+"'");
    }

    // Komenty:
    // jezeli dodajesz do mapy drugi nowa wartosc dla klucza ktory juz jest w mapie to HashMap poprostu nadpisze poprzednia wartosc i program bedzie kontunuowany prawidlowo.
    // Dla porownania w C# klasa Dictionary (odpowiednik HashMap) w takim przypadku wyrzuca wyjatek ze "Key already added to map" - cos w ten desen...

    // co do metod equals i hash map dla klasy lemmatyzator:
    // aktualnie klasa Lematyzator nie psiada zadnych pol, wiec standrdowa implementacja hashCode() jest w zupelnosci wystarczajaca i z uwagi na brak dodatkowych pol z danymi nie ma
    // na czym oprzez dedykowanej metody hashCode() dla takiej klasy.
    // Gdyby mape przechowywac jako pole to mozna by zaimnplementowac GetHashCode tak

//    @Override
//    public int hashCode() {
//        return super.hashCode() + _mapaLemmow.hashCode();
//    }


    // to samo dla Equals, skoro klasa Lemmatyzator nie posiada pol nie ma czego porownywac oprocz domyslnego porowanania Equals obiektu
    // Gdyby mapa byla polem klasy Lemmatyzator to Equals mogloby wygladac tak:

//    public class Lemmatyzator {
//
//    ...
//
//    HashMap<String, String> mapa;
//
//    ...
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Lemmatyzator)
//        {
//            Lemmatyzator other = (Lemmatyzator) obj;
//            return mapa.equals(other.mapa);
//        }
//        else return false;
//    }

    // Ale co do zasady to majac kilka lemmatyzatorow pytanie jest takie - co to znaczy ze te lemmatyzatory sa takie same?
    // czy to ze maja takie same mapy czyni je takie same?
    // a moze chcialbys miec w programie kilka lemmatyzatorow z takimi samymi mapami ale np jednak program powinien je jednak rozrozniac z jakiegos istotnego dla jego pracy powodu ?
    // Takim powodem moze byc to ze skladujesz lemmatyzatory w kolekcji HashSet i chcesz wiedziec czy taki lemmatyzator juz jest w Set'cie czy nie ... wtedy metoda equals sie przydaje
    // pytanie tylko znowu co to znaczy ze dwa lemmatyzatory sa takie same ... ich stan mapy czy to czy to sa te same instancje ... ?

}
