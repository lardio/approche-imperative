package fr.algorithmie;

public class FabriquerMur {
	
	public static void main(String[] args) {
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}
	
    static boolean fabriquerMur (int nbSmall, int nbBig, int longueur) {
    	if(nbSmall + nbBig * 5 < longueur) {
    		return false;
    	}else if (longueur % 5 == 0 && longueur / 5 <=  nbBig) {
    		return true;
    	}else if (longueur <=  nbSmall) {
    		return true;
    	} else if (longueur / 5 <= nbBig && longueur % 5 <= nbSmall) {
    		return true;
    	} else if ((longueur - nbSmall) / 5 <= nbBig && (longueur - nbSmall) % 5 == 0) {
    		return true;
    	}
    	return false;
    }
    
    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
    	if(!fabriquerMur(nbSmall, nbBig, longueur) ) {
    		System.err.println("Impossible de construire le mur de " +longueur  +" mètres avec " + nbSmall + " petites briques et " + nbBig + " grosses briques.");
    	} else {
    		System.out.println("Construction du mur OK.");
    	}
    }
}
