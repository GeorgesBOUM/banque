# banque
projet banque (inspiré par Anne Tasso)

## <u>Le modèle</u>
#### Agent (id, nom, prenom, listeDeClients)
On doit pouvoir :
* Afficher les informations d'un agent ayant son id ou son nom
* Afficher les informations d'un client de l'agent ayant le nom du client ou son id
* Ajouter un agent
* Ajouter un client à un agent
* Supprimer définitivement un client
* Transférer un client d'un agent à un autre

#### Client (id, nom, prenom, dateNaissance, lieuNaissance, listeDeComptes, agent)
On doit pouvoir :
* Afficher les informations d'un client
* Créer un compte à un client

#### Compte (id, listeDeLignesComptables, solde, agent) ==> classe mère abstraite
#### CompteCourant (titulaire)
On doit pouvoir :
*
#### CompteEpargne (titulaire, taux)
On doit pouvoir :
*
#### CompteJoint (listeDeTitulaires)
On doit pouvoir :
*
#### LigneComptable (id, date, motif, valeur, moyenDePaiement)
On doit pouvoir :
*
#### MoyenDePaiement (CB, VIREMENT, CHEQUE) => énum
On doit pouvoir :
*
