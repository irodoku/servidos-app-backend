package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;


@Entity // This tells Hibernate to make a table out of this class
public class Horario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer idNegocio;
	private Time HoraLunesA;
	private Time HoraLunesC;
	private Time HoraMartesA;
	private Time HoraMartesC;
	private Time HoraMiercolesA;
	private Time HoraMiercolesC;
	private Time HoraJuevesA;
	private Time HoraJuevesC;
	private Time HoraViernesA;
	private Time HoraViernesC;
	private Time HoraSabadoA;
	private Time HoraSabadoC;
	private Time HoraDomingoA;
	private Time HoraDomingoC;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdNegocio() {
		return idNegocio;
	}

	public void setIdNegocio(Integer idNegocio) {
		this.idNegocio = idNegocio;
	}

	public Time getHoraLunesA() {
		return HoraLunesA;
	}

	public void setHoraLunesA(Time horaLunesA) {
		HoraLunesA = horaLunesA;
	}

	public Time getHoraLunesC() {
		return HoraLunesC;
	}

	public void setHoraLunesC(Time horaLunesC) {
		HoraLunesC = horaLunesC;
	}

	public Time getHoraMartesA() {
		return HoraMartesA;
	}

	public void setHoraMartesA(Time horaMartesA) {
		HoraMartesA = horaMartesA;
	}

	public Time getHoraMartesC() {
		return HoraMartesC;
	}

	public void setHoraMartesC(Time horaMartesC) {
		HoraMartesC = horaMartesC;
	}

	public Time getHoraMiercolesA() {
		return HoraMiercolesA;
	}

	public void setHoraMiercolesA(Time horaMiercolesA) {
		HoraMiercolesA = horaMiercolesA;
	}

	public Time getHoraMiercolesC() {
		return HoraMiercolesC;
	}

	public void setHoraMiercolesC(Time horaMiercolesC) {
		HoraMiercolesC = horaMiercolesC;
	}

	public Time getHoraJuevesA() {
		return HoraJuevesA;
	}

	public void setHoraJuevesA(Time horaJuevesA) {
		HoraJuevesA = horaJuevesA;
	}

	public Time getHoraJuevesC() {
		return HoraJuevesC;
	}

	public void setHoraJuevesC(Time horaJuevesC) {
		HoraJuevesC = horaJuevesC;
	}

	public Time getHoraViernesA() {
		return HoraViernesA;
	}

	public void setHoraViernesA(Time horaViernesA) {
		HoraViernesA = horaViernesA;
	}

	public Time getHoraViernesC() {
		return HoraViernesC;
	}

	public void setHoraViernesC(Time horaViernesC) {
		HoraViernesC = horaViernesC;
	}

	public Time getHoraSabadoA() {
		return HoraSabadoA;
	}

	public void setHoraSabadoA(Time horaSabadoA) {
		HoraSabadoA = horaSabadoA;
	}

	public Time getHoraSabadoC() {
		return HoraSabadoC;
	}

	public void setHoraSabadoC(Time horaSabadoC) {
		HoraSabadoC = horaSabadoC;
	}

	public Time getHoraDomingoA() {
		return HoraDomingoA;
	}

	public void setHoraDomingoA(Time horaDomingoA) {
		HoraDomingoA = horaDomingoA;
	}

	public Time getHoraDomingoC() {
		return HoraDomingoC;
	}

	public void setHoraDomingoC(Time horaDomingoC) {
		HoraDomingoC = horaDomingoC;
	}
}
