public class Main {
    public static void main(String[] args) {
        Scoala scoala = new Scoala();
        Clasa clasa1A = new Clasa(30, NumarClasa.I, 'A');
        Clasa clasa1B = new Clasa(25, NumarClasa.I, 'B');
        Clasa clasa2B = new Clasa(25, NumarClasa.II, 'B');

        scoala.adaugaClasa("1A", clasa1A);
        scoala.adaugaClasa("1B", clasa1B);
        scoala.adaugaClasa("2B", clasa2B);

        Elev elev1 = new Elev("Marius", Gen.Masculin);
        Elev elev2 = new Elev("Darius", Gen.Masculin);
        Elev elev3 = new Elev("Bianca", Gen.Feminin);

        scoala.adaugaElevInClasa("1A", elev1);
        scoala.adaugaElevInClasa("1B", elev2);
        scoala.adaugaElevInClasa("2B", elev3);

        System.out.println("Numar clase: " + scoala.getNumarClase());
        System.out.println("Total elevi: " + scoala.getTotalElevi());
    }
}