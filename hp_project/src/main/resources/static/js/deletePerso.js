function deletePerso(idPerso){
    if(confirm("Etes vous sûr de vouloir supprimer le personnage ? (action irréversible)")){
        window.location.href = "/deletePerso?idPerso="+idPerso;
    }
}