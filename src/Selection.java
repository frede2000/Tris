public class Selection {
    private boolean trie;
    // p.s. c pas selection pour vrai

    public Livre[] tri(Livre[] tabLivre){
        boolean trie = false;
        int y = 0;

        do{
            for(int i = 0; i < tabLivre.length-1; i++){
                if(tabLivre[i].getAnneePublication() >= tabLivre[i+1].getAnneePublication())
                {
                    Livre livre = tabLivre[i];
                    Livre livre1 = tabLivre[i+1];
                    tabLivre[i] = livre1;
                    tabLivre[i+1] = livre;
                }
            }
            for(int i = 0; i < tabLivre.length-1; i++)
            {
                if(tabLivre[i].getAnneePublication() <= tabLivre[i+1].getAnneePublication())
                {
                    y++;
                }
            }
            if(y == tabLivre.length-1)
            {
                trie = true;
            }
            y = 0;
        }while(!trie);
        return tabLivre;
    }

}
