public class Livre {
    private int iSBN;
    private String titre;
    private String sousTitre;
    private String auteur;
    private String maisonEition;
    private int anneePublication;

    public Livre(int iSBN, String titre, String sousTitre, String auteur, String maisonEition, int anneePublication){
        this.iSBN = iSBN;
        this.titre = titre;
        this.sousTitre = sousTitre;
        this.auteur = auteur;
        this.maisonEition = maisonEition;
        this.anneePublication = anneePublication;
    }

    public int getAnneePublication(){return this.anneePublication;}
}
