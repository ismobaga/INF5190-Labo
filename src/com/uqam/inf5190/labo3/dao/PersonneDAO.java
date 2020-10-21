package com.uqam.inf5190.labo3.dao;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.uqam.inf5190.labo3.dto.CoordonneeDTO;
import com.uqam.inf5190.labo3.dto.PersonneDTO;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PersonneDAO {
	private String filePath = "/home/ismail/eclipse/data/personnes.txt";
	private DAOHelper daoHelper;
	private Logger LOG = Logger.getLogger(PersonneDAO.class);
	ArrayList<PersonneDTO> listePersonnes = new ArrayList<>();

	public PersonneDAO() {
		daoHelper = new DAOHelper();
	}

	public ArrayList<PersonneDTO> getAll() {
		LOG.info("Liste personnes from mysql");
		Connection conn;

		try {
			conn = daoHelper.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT prenom, nom, adresse, courriel FROM personnes");

			while (rs.next()) {
				String prenom = rs.getString("prenom");
				String nom = rs.getString("nom");
				String adresse = rs.getString("adresse");
				String courriel = rs.getString("courriel");

				listePersonnes.add(new PersonneDTO(prenom, nom, new CoordonneeDTO(adresse, courriel)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listePersonnes;
	}

	public ArrayList<PersonneDTO> getAllFichier() {

		try {
			// File myObj = new File("personnes.txt");
			Scanner myReader = new Scanner(new File(filePath));

			String prenom;
			String nom;
			String adresse;
			String courriel;

			while (myReader.hasNextLine()) {

				prenom = myReader.nextLine();
				nom = myReader.nextLine();
				adresse = myReader.nextLine();
				courriel = myReader.nextLine();

				listePersonnes.add(new PersonneDTO(prenom, nom, new CoordonneeDTO(adresse, courriel)));

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Le fichier est inexistant.");
			e.printStackTrace();
		}

		return listePersonnes;
	}

	public void save(PersonneDTO personne) {
		listePersonnes.add(personne);
	}

	public void delete(PersonneDTO personne) {
		listePersonnes.remove(personne);
	}
	public void ajouterPersonne(PersonneDTO personne) {
		Connection conn;

		try {
			conn = daoHelper.getConnection();
			

			PreparedStatement stmt ;
			String goodSql = "INSERT INTO personnes(prenom, nom, adresse, courriel) values(?,?,?,?)";
			stmt = conn.prepareStatement(goodSql);
			stmt.setString(1, personne.getPrenom());
			stmt.setString(2, personne.getNom());
			stmt.setString(3, personne.getCoordonnee().getAdresse());
			stmt.setString(4, personne.getCoordonnee().getCourriel());
			
			
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void ajouterPersonneBad(PersonneDTO personne) {
		Connection conn;

		try {
			conn = daoHelper.getConnection();
			Statement stmt =  conn.createStatement();
			

			String sql = "INSERT INTO personnes (prenom, nom, adresse, courriel) VALUES ('" + personne.getPrenom()
					+ "', '" + personne.getNom() + "', '" + personne.getCoordonnee().getAdresse() + "', '"
					+ personne.getCoordonnee().getCourriel() + "');";
			
			
			stmt.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void ajouterPersonneFichier(PersonneDTO personne) {
		try {
			File file = new File(filePath);
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(personne.getPrenom() + "\n");
			bw.write(personne.getNom() + "\n");
			bw.write(personne.getCoordonnee().getAdresse() + "\n");
			bw.write(personne.getCoordonnee().getCourriel() + "\n");

			bw.close();

		} catch (Exception e) {

		}
		return;
	}

}
