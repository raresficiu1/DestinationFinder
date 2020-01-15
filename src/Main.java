import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        //1) Cautam niste aeropoarte pe care putem ateriza amandoi plecand dintr un aeroport apropiat de noi (Daria - Timisoara, Budapesta, Eu- Toate Aeropoartele din Anglia)

        ArrayList<String> DestinatiiValide = new ArrayList<>();
        Aeroport Timisoara = CreateTimisoaraAirport();
        System.out.println(Timisoara.getDestinatii());
        Aeroport Luton = CreateLutonAirport();
        System.out.println(Luton.getDestinatii());
        System.out.println(Timisoara.getDestinatii().size());


        for(int i = 0;i<Timisoara.getDestinatii().size() ;i++){
            for (int j =0;j<Luton.getDestinatii().size();j++){
                if(Timisoara.getDestinatii().get(i)==Luton.getDestinatii().get(j)){
                    DestinatiiValide.add(Timisoara.getDestinatii().get(i));

                }
            }
        }

        System.out.println(DestinatiiValide);

        //1.1) Dintre mine si Daria iau care dintre noi are mai putine variante de destinatii (si verific cate dintre ele au zboruri valide)

        //1.2) Dupa ce avem lista lu Dariusa, cautam pe cate dintre ele poate ajunge Rares

        //1.3)* Intram pe site si sa verificam pretul zborurilor

        //2)*Cautam transport


        //3)*Cautam cazare


        //4)*Alegem varianta cea mai ieftina

    }












    public static Aeroport CreateTimisoaraAirport(){
        //Destinatii posibile Dariusa
        ArrayList<String> destinatii_timisoara = new ArrayList<>();
        destinatii_timisoara.add("Munchen");
        destinatii_timisoara.add("Frankfurt Main");
        destinatii_timisoara.add("Bucharest");
        destinatii_timisoara.add("Iasi");
        destinatii_timisoara.add("Bergamo");
        destinatii_timisoara.add("Luton");
        destinatii_timisoara.add("Roma");
        destinatii_timisoara.add("Memmingen");
        destinatii_timisoara.add("Dortmund");
        destinatii_timisoara.add("Bologna");
        destinatii_timisoara.add("Tel Aviv");
        destinatii_timisoara.add("Valencia");
        destinatii_timisoara.add("Treviso");
        destinatii_timisoara.add("Madrid");
        destinatii_timisoara.add("Paris");
        destinatii_timisoara.add("Frankfurt Hahn");
        destinatii_timisoara.add("Barcelona");
        destinatii_timisoara.add("Bruxelles");
        destinatii_timisoara.add("Bari");
        destinatii_timisoara.add("Nurnberg");
        destinatii_timisoara.add("Karlsruhe");
        destinatii_timisoara.add("Stuttgart");

        Aeroport Timisoara = new Aeroport(destinatii_timisoara);

        return Timisoara;

    }

    public static Aeroport CreateLutonAirport(){
        //Destinatii posibile eu
        ArrayList<String> destinatiiLuton = new ArrayList<>();
        destinatiiLuton.add("Aberdeen");
        destinatiiLuton.add("Alicante");
        destinatiiLuton.add("Amsterdam");
        destinatiiLuton.add("Antalya");
        destinatiiLuton.add("Barcelona");
        destinatiiLuton.add("Basel");
        destinatiiLuton.add("Belfast");
        destinatiiLuton.add("Biarritz");
        destinatiiLuton.add("Bodrum");
        destinatiiLuton.add("Bordeaux");
        destinatiiLuton.add("Bourgas");
        destinatiiLuton.add("Bucharest");
        destinatiiLuton.add("Budapest");
        destinatiiLuton.add("Catania");
        destinatiiLuton.add("Copenhagen");
        destinatiiLuton.add("Corfu");
        destinatiiLuton.add("Dalaman");
        destinatiiLuton.add("Dortmund");
        destinatiiLuton.add("Dubrovnik");
        destinatiiLuton.add("Edinburgh");
        destinatiiLuton.add("Faro");
        destinatiiLuton.add("Florence");
        destinatiiLuton.add("Fuerteventura");
        destinatiiLuton.add("Funchal");
        destinatiiLuton.add("Geneva");
        destinatiiLuton.add("Gran Canaria");
        destinatiiLuton.add("Grenoble");
        destinatiiLuton.add("Hamburg");
        destinatiiLuton.add("Glasgow");
        destinatiiLuton.add("Heraklion");
        destinatiiLuton.add("Iasi");
        destinatiiLuton.add("Ibiza");
        destinatiiLuton.add("Innsbruck");
        destinatiiLuton.add("Inverness");
        destinatiiLuton.add("Isle Of Man");
        destinatiiLuton.add("Izmir");
        destinatiiLuton.add("Jersey");
        destinatiiLuton.add("Kefalonia");
        destinatiiLuton.add("Krakow");
        destinatiiLuton.add("Lanzarote");
        destinatiiLuton.add("Larnaca");
        destinatiiLuton.add("Lyons");
        destinatiiLuton.add("Madrid");
        destinatiiLuton.add("Majorca");
        destinatiiLuton.add("Malaga");
        destinatiiLuton.add("Marseille");
        destinatiiLuton.add("Menorca");
        destinatiiLuton.add("Milan");
        destinatiiLuton.add("Montpellier");
        destinatiiLuton.add("Munich");
        destinatiiLuton.add("Mykonos");
        destinatiiLuton.add("Nantes");
        destinatiiLuton.add("Naples");
        destinatiiLuton.add("Nice");
        destinatiiLuton.add("Olbia");
        destinatiiLuton.add("Paphos");
        destinatiiLuton.add("Paris");
        destinatiiLuton.add("Pisa");
        destinatiiLuton.add("Porto");
        destinatiiLuton.add("Prague");
        destinatiiLuton.add("Reus");
        destinatiiLuton.add("Reykjavik");
        destinatiiLuton.add("Rhodes");
        destinatiiLuton.add("Rome");
        destinatiiLuton.add("Salzburg");
        destinatiiLuton.add("San Sebastian");
        destinatiiLuton.add("Seville");
        destinatiiLuton.add("Skiathos");
        destinatiiLuton.add("Split");
        destinatiiLuton.add("Stockholm");
        destinatiiLuton.add("Tel Aviv");
        destinatiiLuton.add("Tenerife");
        destinatiiLuton.add("Toulouse");
        destinatiiLuton.add("Turin");
        destinatiiLuton.add("Valencia");
        destinatiiLuton.add("Venice");
        destinatiiLuton.add("Vienna");
        destinatiiLuton.add("Vigo");
        destinatiiLuton.add("Zadar");
        destinatiiLuton.add("Zakinthos");
        destinatiiLuton.add("Zurich");


        Aeroport Luton = new Aeroport(destinatiiLuton);

        return Luton;

    }



}
