public class Main {
    public static void main(String[] args) {
        Selection selection = new Selection();
        Livre[] tabLivre = new Livre[7];
        tabLivre[0] = new Livre(00,"C","C","C","C",3);
        tabLivre[1] = new Livre(00,"E","E","E","E",5);
        tabLivre[2] = new Livre(00,"A","A","A","A",8);
        tabLivre[3] = new Livre(00,"A","A","A","A",6);
        tabLivre[4] = new Livre(00,"A","A","A","A",4);
        tabLivre[5] = new Livre(00,"A","A","A","A",3);
        tabLivre[6] = new Livre(00,"A","A","A","A",9);

        for(int i = 0; i < tabLivre.length; i++)
            System.out.print(tabLivre[i].getAnneePublication() + " ");

        tabLivre = selection.tri(tabLivre);

        System.out.print("\n");

        for(int i = 0; i < tabLivre.length; i++)
            System.out.print(tabLivre[i].getAnneePublication() + " ");
    }
}
