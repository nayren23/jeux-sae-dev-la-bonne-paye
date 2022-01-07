package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Affichage.PositionPlateau;

public class PositionPlateauTest {

	@Test
	public final void testPositionPlateau() {		
		//pour case 0
		
		//test pour joueurs1
		int[] coordonnesReelles = PositionPlateau.recupererCoordonnees(0,0);
		assertEquals(2, coordonnesReelles[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(1, coordonnesReelles[1], "cas longueur > 0, négatifs aux bornes");

		//test pour joueurs2
		int[] coordonnesReelles2 = PositionPlateau.recupererCoordonnees(0,1);
		assertEquals(2, coordonnesReelles2[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(2, coordonnesReelles2[1], "cas longueur > 0, négatifs aux bornes");

		//test pour joueurs3
		int[] coordonnesReelles3 = PositionPlateau.recupererCoordonnees(0,2);
		assertEquals(2, coordonnesReelles3[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(3, coordonnesReelles3[1], "cas longueur > 0, négatifs aux bornes");

		//test pour joueurs4
		int[] coordonnesReelles4 = PositionPlateau.recupererCoordonnees(0,3);
		assertEquals(3, coordonnesReelles4[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(1, coordonnesReelles4[1], "cas longueur > 0, négatifs aux bornes");

		//test pour joueurs5
		int[] coordonnesReelles5 = PositionPlateau.recupererCoordonnees(0,4);
		assertEquals(3, coordonnesReelles5[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(2, coordonnesReelles5[1], "cas longueur > 0, négatifs aux bornes");

		//test pour joueurs6
		int[] coordonnesReelles6 = PositionPlateau.recupererCoordonnees(0,5);
		assertEquals(3, coordonnesReelles6[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(3, coordonnesReelles6[1], "cas longueur > 0, négatifs aux bornes");
		
		
		
		//pour case 10 à l'opposé
		
		//test pour joueurs1
		int[] coordonnesReelles7 = PositionPlateau.recupererCoordonnees(10,0);
		assertEquals(22, coordonnesReelles7[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(21, coordonnesReelles7[1], "cas longueur > 0, négatifs aux bornes");

		//test pour joueurs2
		int[] coordonnesReelles8 = PositionPlateau.recupererCoordonnees(10,1);
		assertEquals(22, coordonnesReelles8[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(22, coordonnesReelles8[1], "cas longueur > 0, négatifs aux bornes");

		//test pour joueurs3
		int[] coordonnesReelles9 = PositionPlateau.recupererCoordonnees(10,2);
		assertEquals(22, coordonnesReelles9[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(23, coordonnesReelles9[1], "cas longueur > 0, négatifs aux bornes");

		//test pour joueurs4
		int[] coordonnesReelles10 = PositionPlateau.recupererCoordonnees(10,3);
		assertEquals(23, coordonnesReelles10[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(21, coordonnesReelles10[1], "cas longueur > 0, négatifs aux bornes");

		//test pour joueurs5
		int[] coordonnesReelles11 = PositionPlateau.recupererCoordonnees(10,4);
		assertEquals(23, coordonnesReelles11[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(22, coordonnesReelles11[1], "cas longueur > 0, négatifs aux bornes");

		//test pour joueurs6
		int[] coordonnesReelles12 = PositionPlateau.recupererCoordonnees(10,5);
		assertEquals(23, coordonnesReelles12[0], "cas longueur > 0, négatifs aux bornes");
		assertEquals(23, coordonnesReelles12[1], "cas longueur > 0, négatifs aux bornes");

	}
}
