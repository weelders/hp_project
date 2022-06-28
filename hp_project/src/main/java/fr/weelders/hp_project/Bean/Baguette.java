package fr.weelders.hp_project.Bean;

public class Baguette
{
    private final int id_baguette;
    private final TailleBaguette taille_baguette;
    private final Epaisseur epaisseur;
    private final Flexibilite flexibilite;
    private final Coeur coeur;
    private final Bois bois;

    public Baguette(int id_baguette, TailleBaguette taille_baguette, Epaisseur epaisseur, Flexibilite flexibilite, Coeur coeur, Bois bois)
    {
        this.id_baguette = id_baguette;
        this.taille_baguette = taille_baguette;
        this.epaisseur = epaisseur;
        this.flexibilite = flexibilite;
        this.coeur = coeur;
        this.bois = bois;
    }

    public int getId_baguette()
    {
        return id_baguette;
    }

    public TailleBaguette getTaille_baguette()
    {
        return taille_baguette;
    }

    public Epaisseur getEpaisseur()
    {
        return epaisseur;
    }

    public Flexibilite getFlexibilite()
    {
        return flexibilite;
    }

    public Coeur getCoeur()
    {
        return coeur;
    }

    public Bois getBois()
    {
        return bois;
    }
}
