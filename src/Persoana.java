import java.lang.reflect.Array;
import java.util.ArrayList;

public class Persoana {
    ArrayList<Aeroport> aeropoartePlecare;

    public void crearePersoana(ArrayList<Aeroport> aeropoartePlecare)
    {
        this.aeropoartePlecare = aeropoartePlecare;
    }


    public ArrayList<String> getDestinations(){

        ArrayList<String> destinations = new ArrayList<>();

        for(int i=0; i<aeropoartePlecare.size(); i++)
        {

        }
    }
}
